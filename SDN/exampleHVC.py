import networkx as nx
import sys
from copy import deepcopy

class Allocator(object) :
    # Extra parameter G is given as of now. Would be removed as we go along.
    def __init__(self, physical_topology_file) :
        # To be modified as required.
        G = nx.Graph()
        self._switches = []
        physical_file = physical_topology_file.read()
        physical_file = physical_file.splitlines()
        for i in range(1, int(physical_file[0])+1) :
            G.add_node('h' + str(i))
        for i in range(1, int(physical_file[1])+1) :
            G.add_node('s' + str(i))
            self._switches.append('s' + str(i))
        for i in physical_file[3:] :
            nodes_and_bandwidth = i.split(',')
            node1 = nodes_and_bandwidth[0]
            node2 = nodes_and_bandwidth[1]
            bandwidth = int(nodes_and_bandwidth[2])
            G.add_edge(node1, node2, bandwidth = bandwidth)
        self.G = G
        # self.pretty(G)

    def pretty(self, G) :
        for vertex in G :
            print str(vertex) + " : " + str(G[vertex])

    def remove_lesser_edges(self, G, bandwidth) :
        G1 = nx.Graph()
        for vertex in G :
            G1.add_node(vertex)
        for vertex in G :
            for adjacent_vertex in G[vertex] :
                if G[vertex][adjacent_vertex]['bandwidth'] >= bandwidth :
                    if adjacent_vertex not in G1[vertex] :
                        G1.add_edge(
                            vertex,
                            adjacent_vertex,
                            bandwidth = G[vertex][adjacent_vertex]['bandwidth']
                        )
        return G1

    # Function can be filled in if required. If you can think of
    # a proper cost parameter, fill this is in.
    # def compute_cost(G) :
    #     cost = 0
    #     for vertex in G :
    #         for adjacent_vertex in G[vertex] :
    #             edge_properties = G[vertex][adjacent_vertex]
    #             left_over_bandwidth = edge_properties['weight']
    #             original_bandwidth = 1.0/edge_properties['cost']
    #             flow_value = original_bandwidth - left_over_bandwidth
    #             cost = (
    #                 cost + (
    #                     ((flow_value * 1.0)/original_bandwidth) *
    #                     edge_properties['cost_per_bandwidth']
    #                 )
    #             )
    #     return cost

    def try_allocation(
        self, center, host_to_bandwidth_map
    ) :
        paths = []
        graph_to_be_processed = deepcopy(self.G)
        def update_graph(G, bandwidth, path) :
            for vertex_index in range(len(path)-1) :
                v1 = path[vertex_index]
                v2 = path[vertex_index+1]
                G[v1][v2]['bandwidth'] = G[v1][v2]['bandwidth'] - bandwidth

        for host in host_to_bandwidth_map :
            requested_bandwidth = host_to_bandwidth_map[host]
            G1 = self.remove_lesser_edges(
                graph_to_be_processed, requested_bandwidth
            )
            path = []
            try :
                path = nx.shortest_path(
                    G1, source = center, target = host
                )
            except :
                return None
            paths.append(path)
            update_graph(graph_to_be_processed, requested_bandwidth, path)
        return paths

    # Takes in a host to bandwidth (requested) map and set of centre switches
    # which are to be iterated through
    def service_star_request(self, host_to_bandwidth_map, switches) :

        for switch in switches :
            paths = self.try_allocation(
                switch, host_to_bandwidth_map
            )
            if paths is not None :
                return paths
        return None

    def place_order(self, host_to_bandwidth_map, switches=None) :
        number_of_iterations = 5
        low_bandwidth = {}
        high_bandwidth = {}
        mid_bandwidth = {}
        serviced_bandwidth = {}
        paths = None
        if switches is None :
            switches = self._switches

        def make_mid() :
            for i in low_bandwidth :
                mid_bandwidth[i] = 0.5*(low_bandwidth[i] + high_bandwidth[i])

        for i in host_to_bandwidth_map :
            high_bandwidth[i] = host_to_bandwidth_map[i]
            low_bandwidth[i] = 0

        paths = self.service_star_request(high_bandwidth, switches)
        if paths is not None :
            return (True, None, paths)
        for _ in range(number_of_iterations) :
            make_mid()
            current_paths = self.service_star_request(
                mid_bandwidth, switches
            )
            if current_paths is not None :
                paths = current_paths
                low_bandwidth = deepcopy(mid_bandwidth)
                serviced_bandwidth = deepcopy(mid_bandwidth)
            else :
                high_bandwidth = deepcopy(mid_bandwidth)

        # print "We are not able to service the request, but check whether the following QOS is good enough"
        # for vertex in serviced_bandwidth :
        #     print str(vertex) + " : QOS Asked for = " + str(host_to_bandwidth_map[vertex]) + ", Service possible : " + str(serviced_bandwidth[vertex])

        return (False, serviced_bandwidth, paths)

    def request(self, requested_star_file) :
        requested_star_file = requested_star_file.read()
        requested_star = requested_star_file.splitlines()
        host_to_bandwidth_map = {}
        for string in requested_star[1:] :
            host_and_bandwidth = string.split(',')
            host = host_and_bandwidth[0]
            bandwidth = int(host_and_bandwidth[1])
            host_to_bandwidth_map[host] = bandwidth
        paths = self.place_order(host_to_bandwidth_map)
        if paths[0] :
            print "Request Serviced"
        else :
            print "Request Failed"
            serviced_bandwidth = paths[1]
            for vertex in serviced_bandwidth :
                print str(vertex) + " : QOS Asked for = " + str(host_to_bandwidth_map[vertex]) + ", Service possible : " + str(serviced_bandwidth[vertex])
        for path in paths[2] :
            st = path[len(path)-1] + " : "
            for i in range(len(path)) :
                st = st + str(path[len(path)-1-i]) + " "
            print st
        return paths
# G = nx.Graph()
# G.add_node(1)
# G.add_node(2)
# G.add_node(3)
# G.add_node(4)
# G.add_node(5)
# G.add_node(6)
# G.add_edge(1, 3, bandwidth = 50)
# G.add_edge(2, 3, bandwidth = 50)
# G.add_edge(3, 4, bandwidth = 52)
# G.add_edge(3, 5, bandwidth = 55)
# G.add_edge(4, 6, bandwidth = 52)
# G.add_edge(5, 6, bandwidth = 55)
file1 = sys.argv[1]
file2 = sys.argv[2]
input_topology_file = open(file1)
allocator = Allocator(input_topology_file)
requested_star_file = open(file2)
paths = allocator.request(requested_star_file)
print paths[2]
input_topology_file.close()
requested_star_file.close()


################### Floodlight part ######################
import json

def get_mac_addr(node):
    nodeid = node[1:]
    print "00:00:00:00:00:0"+nodeid
    return "00:00:00:00:00:0"+nodeid
def get_dpid(switch):
    switchid = switch[1:]
    print "00-00-00-00-00-0"+switchid
    return "00-00-00-00-00-0"+switchid

paths = paths[2]
fil = open("portdetails", 'r')
fil.readline()
fil.readline()
port = {}
rules = []
link = "http://127.0.0.1:8080/wm/staticflowpusher/json"

def add_rule_based_on_src(switch, forward_to_switch, mac_addr,index):
    dpid = get_dpid(switch)
    data = {}
    data['switch'] = dpid
    data['name'] = str(index)
    data['priority'] = "32760"
    data['dl_src'] = mac_addr
    data['hard_timeout'] = '1000000'
    data['instruction_apply_actions'] = "port="+str(port[switch][forward_to_switch])
    rule = "curl -d '"+json.dumps(data)+"' "+link
    rules.append(rule)

def add_rule_based_on_dst(switch, forward_to_switch, mac_addr,index):
    dpid = get_dpid(switch)
    data = {}
    data['switch'] = dpid
    data['name'] = str(index)
    data['priority'] = "32770"
    data['dl_dst'] = mac_addr
    data['hard_timeout'] = '1000000'
    data['instruction_apply_actions'] = "port="+str(port[switch][forward_to_switch])
    rule = "curl -d '"+json.dumps(data)+"' "+link
    rules.append(rule)

def add_rule_to_central_switch(switch, forward_to_switch, mac_addr):
    dpid = get_dpid(switch)
    data = {}
    data['switch'] = dpid
    data['name'] = str(index)
    data['priority'] = "32770"
    data['dl_dst'] = mac_addr
    data['hard_timeout'] = '1000000'
    data['instruction_apply_actions'] = "port="+str(port[switch][forward_to_switch])
    rule = "curl -d '"+json.dumps(data)+"' "+link
    rules.append(rule)


for line in fil:
    l = line.strip().split(',')
    if l[0] not in port.keys():
        port[l[0]] = {}
    port[l[0]][l[1]] = int(l[2])

print port

for item in paths:
    end_node = item[-1]
    mac_addr = get_mac_addr(end_node)
    index = 1
    for i in range(1, len(item) - 1):
        add_rule_based_on_src(item[i],item[i-1],mac_addr,index)
        index += 1
    add_rule_to_central_switch(item[0], item[1],mac_addr)
    for i in range(1,len(item)-1):
        add_rule_based_on_dst(item[i],item[i+1],mac_addr,index)
        index += 1

for i in rules:
    print i
