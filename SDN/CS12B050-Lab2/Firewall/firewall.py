'''Coursera:
- Software Defined Networking (SDN) course
-- Programming Assignment: Layer-2 Firewall Application

Professor: Nick Feamster
Teaching Assistant: Arpit Gupta
'''

from pox.core import core
import pox.openflow.libopenflow_01 as of
from pox.lib.revent import *
from pox.lib.util import dpidToStr
from pox.lib.addresses import EthAddr
from collections import namedtuple
import os
''' Add your imports here ... '''

log = core.getLogger()
policyFile = "%s/pox/pox/misc/firewall-policies.csv" % os.environ['HOME']


class Firewall(EventMixin):

    def __init__(self):
        self.listenTo(core.openflow)
        log.debug("Enabling Firewall Module")
        f = open(policyFile, 'r')
        self.lines = []
        self.is_mac = []
        bool = False
        for line in f:
            if bool :
                a = line[:-1].split(',')
                self.lines.append((a[1], a[2]))
                if a[1].find(".") == -1 :
                    self.is_mac.append(True)
                else :
                    self.is_mac.append(False)
            bool = True
        f.close()

    def _handle_ConnectionUp(self, event):
        ''' Add your logic here ... '''
        msg = of.ofp_flow_mod()
        match = of.ofp_match()
        k = 1 << 15
        for (line, is_mac) in zip(self.lines, self.is_mac):
            if is_mac :
                match.dl_src = EthAddr(line[0])
                match.dl_dst = EthAddr(line[1])
            else :
                match.dl_type = pkt.ethernet.IP_TYPE
                match.nw_src = line[0]
                match.nw_dst = line[1]
            k = k+1
            msg.priority = k
            msg.match = match
            event.connection.send(msg)
# log.debug("Firewall rules installed on %s", dpidToStr(event.dpid))

def launch():
    '''
    Starting the Firewall module
    '''
    core.registerNew(Firewall)
