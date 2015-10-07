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

from pox.lib.revent import *
from pox.lib.util import dpid_to_str
from pox.lib.util import dpidToStr
from pox.lib.addresses import IPAddr, EthAddr
from collections import namedtuple
import os

log = core.getLogger()


class TopologySlice (EventMixin):

    def __init__(self):
        self.listenTo(core.openflow)
        log.debug("Enabling Slicing Module")


    """This event will be raised each time a switch will connect to the controller"""
    def _handle_ConnectionUp(self, event):

        # Use dpid to differentiate between switches (datapath-id)
        # Each switch has its own flow table. As we'll see in this
        # example we need to write different rules in different tables.
        dpid = dpidToStr(event.dpid)
        log.debug("Switch %s has come up.", dpid)
        """ Add your logic here """
	port_in_1 = port_in_2 = port_out_1 = port_out_2 = 0
	if dpid[len(dpid)-1] == '1' :
		port_in_1 = 3
		port_out_1 = 1
		port_in_2 = 4
		port_out_2 = 2
	if dpid[len(dpid)-1] == '2' :
		port_in_1 = 1
		port_out_1 = 2

	if dpid[len(dpid)-1] == '3' :
		port_in_1 = 1
		port_out_1 = 2

	if dpid[len(dpid)-1] == '4' :
		port_in_1 = 1
		port_out_1 = 3
		port_in_2 = 2
		port_out_2 = 4

	msg1 = of.ofp_flow_mod()
	msg1.match.in_port = port_in_1
	msg1.actions.append(of.ofp_action_output(port=port_out_1))
	event.connection.send(msg1)
	msg1 = of.ofp_flow_mod()
	msg1.match.in_port = port_out_1
	msg1.actions.append(of.ofp_action_output(port=port_in_1))
	event.connection.send(msg1)
	if port_in_2 != 0 :
		msg1 = of.ofp_flow_mod()
		msg1.match.in_port = port_in_2
		msg1.actions.append(of.ofp_action_output(port=port_out_2))
		event.connection.send(msg1)
		msg1 = of.ofp_flow_mod()
		msg1.match.in_port = port_out_2
		msg1.actions.append(of.ofp_action_output(port=port_in_2))
		event.connection.send(msg1)



def launch():
    # Run spanning tree so that we can deal with topologies with loops
    pox.openflow.discovery.launch()
    pox.openflow.spanning_tree.launch()

    '''
    Starting the Topology Slicing module
    '''
    core.registerNew(TopologySlice)
