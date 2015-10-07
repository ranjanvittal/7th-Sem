'''
Coursera:
- Software Defined Networking (SDN) course
-- Network Virtualization

Professor: Nick Feamster
Teaching Assistant: Arpit Gupta
'''

from pox.core import core
from collections import defaultdict

import pox.openflow.libopenflow_01 as of
import pox.openflow.discovery
import pox.openflow.spanning_tree
import pox.lib.packet as pkt

from pox.lib.revent import *
from pox.lib.util import dpid_to_str
from pox.lib.util import dpidToStr
from pox.lib.addresses import IPAddr, EthAddr
from collections import namedtuple
import os

log = core.getLogger()


class VideoSlice (EventMixin):

    def __init__(self):
            self.listenTo(core.openflow)
            core.openflow_discovery.addListeners(self)

            # Adjacency map.  [sw1][sw2] -> port from sw1 to sw2
            self.adjacency = defaultdict(lambda:defaultdict(lambda:None))

            '''
            The structure of self.portmap is a four-tuple key and a string value.
            The type is:
            (dpid string, src MAC addr, dst MAC addr, port (int)) -> dpid of next switch
            '''
            s1 = '00-00-00-00-00-01'
            s2 = '00-00-00-00-00-02'
            s3 = '00-00-00-00-00-03'
            s4 = '00-00-00-00-00-04'
            h1 = '00:00:00:00:00:01'
            h2 = '00:00:00:00:00:02'
            h3 = '00:00:00:00:00:03'
            h4 = '00:00:00:00:00:04'


	    self.portmap = {
		(s1, EthAddr(h1), EthAddr(h3), 22) : s2,
		(s1, EthAddr(h1), EthAddr(h3), 80) : s3,
		(s1, EthAddr(h1), EthAddr(h4), 22) : s2,
		(s1, EthAddr(h1), EthAddr(h4), 80) : s3,
		(s1, EthAddr(h2), EthAddr(h3), 22) : s2,
		(s1, EthAddr(h2), EthAddr(h3), 80) : s3,
		(s1, EthAddr(h2), EthAddr(h4), 22) : s2,
		(s1, EthAddr(h2), EthAddr(h4), 80) : s3,
		(s2, EthAddr(h1), EthAddr(h3), 22) : s4,
		(s2, EthAddr(h1), EthAddr(h4), 22) : s4,
		(s2, EthAddr(h2), EthAddr(h3), 22) : s4,
		(s2, EthAddr(h2), EthAddr(h4), 22) : s4,
		(s2, EthAddr(h3), EthAddr(h1), 22) : s1,
		(s2, EthAddr(h3), EthAddr(h2), 22) : s1,
		(s2, EthAddr(h4), EthAddr(h1), 22) : s1,
		(s2, EthAddr(h4), EthAddr(h2), 22) : s1,
		(s3, EthAddr(h1), EthAddr(h3), 80) : s4,
		(s3, EthAddr(h1), EthAddr(h4), 80) : s4,
		(s3, EthAddr(h2), EthAddr(h3), 80) : s4,
		(s3, EthAddr(h2), EthAddr(h4), 80) : s4,
		(s3, EthAddr(h3), EthAddr(h1), 80) : s1,
		(s3, EthAddr(h3), EthAddr(h2), 80) : s1,
		(s3, EthAddr(h4), EthAddr(h1), 80) : s1,
		(s3, EthAddr(h4), EthAddr(h2), 80) : s1,
		(s4, EthAddr(h3), EthAddr(h1), 22) : s2,
		(s4, EthAddr(h3), EthAddr(h1), 80) : s3,
		(s4, EthAddr(h3), EthAddr(h2), 22) : s2,
		(s4, EthAddr(h3), EthAddr(h2), 80) : s3,
		(s4, EthAddr(h4), EthAddr(h1), 22) : s2,
		(s4, EthAddr(h4), EthAddr(h1), 80) : s3,
		(s4, EthAddr(h4), EthAddr(h2), 22) : s2,
		(s4, EthAddr(h4), EthAddr(h2), 80) : s3,
	    }
	    self.other = {}
	    self.other[(s1, EthAddr(h1))] = 3
	    self.other[(s1, EthAddr(h2))] = 4
	    self.other[(s4, EthAddr(h3))] = 3
	    self.other[(s4, EthAddr(h4))] = 4

    
    

    def _handle_LinkEvent (self, event):
        l = event.link
        sw1 = dpid_to_str(l.dpid1)
        sw2 = dpid_to_str(l.dpid2)

        log.debug ("link %s[%d] <-> %s[%d]",
                   sw1, l.port1,
                   sw2, l.port2)

        self.adjacency[sw1][sw2] = l.port1
        self.adjacency[sw2][sw1] = l.port2


    def _handle_PacketIn (self, event):
        """
        Handle packet in messages from the switch to implement above algorithm.
        """
        packet = event.parsed
        tcpp = event.parsed.find('tcp')

        def install_fwdrule(event,packet,outport):
            msg = of.ofp_flow_mod()
            msg.idle_timeout = 10
            msg.hard_timeout = 30
            msg.match = of.ofp_match.from_packet(packet, event.port)
            msg.actions.append(of.ofp_action_output(port = outport))
            msg.data = event.ofp
            msg.in_port = event.port
            event.connection.send(msg)

        def forward (message = None):
            this_dpid = dpid_to_str(event.dpid)

            if packet.dst.is_multicast:
                flood()
                return
            else:
                log.debug("Got unicast packet for %s at %s (input port %d):",
                          packet.dst, dpid_to_str(event.dpid), event.port)

                try:

		    def return_port(s1, mac_1, mac_2, port) :
		        if self.portmap.has_key((s1, mac_1, mac_2, port)) :
		            return self.adjacency[s1][self.portmap[(s1, mac_1, mac_2, port)]]
		        else :
		            return self.other[(s1, mac_2)]
		    s1 = dpid_to_str(event.dpid)
		    mac_1 = EthAddr(packet.src)
		    mac_2 = EthAddr(packet.dst)
		    if not tcpp:
		        install_fwdrule(event, packet, of.OFPP_FLOOD)
		    elif tcpp.dstport == 80:
		        msg = of.ofp_flow_mod()
			msg.match = of.ofp_match(dl_type = pkt.ethernet.IP_TYPE, nw_proto = pkt.ipv4.TCP_PROTOCOL, tp_dst = 80)
			msg.match.in_port = event.port
			outport = return_port(s1, mac_1, mac_2, 80)
			msg.actions.append(of.ofp_action_output(port = outport))
			event.connection.send(msg)
		    elif tcpp.srcport == 80:
			msg = of.ofp_flow_mod()
			msg.match = of.ofp_match(dl_type = pkt.ethernet.IP_TYPE, nw_proto = pkt.ipv4.TCP_PROTOCOL, tp_src = 80)
			msg.match.in_port = event.port
			outport = return_port(s1, mac_1, mac_2, 80)
			msg.actions.append(of.ofp_action_output(port = outport))
			event.connection.send(msg)
		    else :
			msg = of.ofp_flow_mod()
			msg.match = of.ofp_match(dl_type = pkt.ethernet.IP_TYPE, nw_proto = pkt.ipv4.TCP_PROTOCOL, tp_dst = tcpp.dst, tp_src = tcpp.src)
			outport = return_port(s1, mac_1, mac_2, 22)
			msg.actions.append(of.ofp_action_output(port = outport))
			msg.match.in_port = event.port
			event.connection.send(msg)
            

                except AttributeError:
                    log.debug("packet type has no transport ports, flooding")

                    # flood and install the flow table entry for the flood
                    install_fwdrule(event,packet,of.OFPP_FLOOD)

        # flood, but don't install the rule
        def flood (message = None):
            """ Floods the packet """
            msg = of.ofp_packet_out()
            msg.actions.append(of.ofp_action_output(port = of.OFPP_FLOOD))
            msg.data = event.ofp
            msg.in_port = event.port
            event.connection.send(msg)

        forward()


    def _handle_ConnectionUp(self, event):
        dpid = dpidToStr(event.dpid)
        log.debug("Switch %s has come up.", dpid)


def launch():
    # Run spanning tree so that we can deal with topologies with loops
    pox.openflow.discovery.launch()
    pox.openflow.spanning_tree.launch()

    '''
    Starting the Video Slicing module
    '''
    core.registerNew(VideoSlice)
