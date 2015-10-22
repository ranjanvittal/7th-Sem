import networkx as nx
import copy

class Allocator(object) :
    def __init__(self, physical_topology_file) :
        self.node_cost = {}
        self.node_capacity = {}
        G = nx.Graph()
        f = open(physical_topology_file, 'r')
        s = f.readline()
        node_capacity = {}
        node_cost = {}
        for i in range(0, int(s)):
            s2 = f.readline()
            words = s2.split(",")
            G.add_node(str(words[0]))
            node_capacity[str(words[0])] = int(words[1])
            node_cost[str(words[0])] = int(words[2])
        s = f.readline()
        for i in range(0, int(s)):
            s2 = f.readline()
            words = s2.split(",")
            G.add_edge(
                str(words[0]),
                str(words[1]),
                capacity = int(words[2]), weight = int(words[3])
            )
        self.G = G
        self.deepcopy = copy.deepcopy
        self.node_capacity = node_capacity
        self.node_cost = node_cost

    def decompose_HVC(self, f, centre) :
        if f is None :
            print "Not possible to service request"
        else:
            print centre
            print f['s_x']

    def service_request(self, N, B, C) :
        INF = 1000000000
        G = self.G
        node_capacity = self.node_capacity
        node_cost = self.node_cost
        G1 = nx.DiGraph()
        G1.add_node('s_x', demand = -N)
        for i in G :
            G1.add_node(i)

        for i in G :
            for j in G[i] :
                G1.add_edge(
                    i, j,
                    capacity = G[i][j]['capacity']/B,
                    weight = G[i][j]['weight']*B,
                )

        for i in G:
            G1.add_edge(
                's_x',
                i,
                capacity = node_capacity[i]/C,
                weight = node_cost[i]*C
            )
            G1.add_edge(
                's_x',
                i,
                capacity = node_capacity[i]/C,
                weight = node_cost[i]*C
            )

        f_val = INF
        centre = None
        f = None
        for i in G:
            try:
                G2 = nx.DiGraph(G1)
                G2.remove_node(i)
                G2.add_node(i, demand = N)
                for j in G[i]:
                    G2.add_edge(
                        i, j,
                        capacity = G[i][j]['capacity']/B,
                        weight = G[i][j]['weight']*B,
                    )
                    G2.add_edge(
                        j, i,
                        capacity = G[i][j]['capacity']/B,
                        weight = G[i][j]['weight']*B,
                    )

                G2.add_edge(
                    's_x', i,
                    capacity = node_capacity[i]/C,
                    weight = node_cost[i]*C
                )
                f1_val = nx.min_cost_flow_cost(G2)
                f1 = nx.min_cost_flow(G2)
                if f1_val < f_val :
                    f = f1
                    f_val = f1_val
                    centre = i
            except:
                pass
        print f_val
        return self.decompose_HVC(f, centre)


allocator = Allocator('Topology.csv')
allocator.service_request(7, 1, 2)
