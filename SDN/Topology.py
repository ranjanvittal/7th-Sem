#!/usr/bin/python
import inspect
import os
import atexit
from mininet.net import Mininet
from mininet.util import dumpNodeConnections
from mininet.log import setLogLevel, info
from mininet.cli import CLI
from mininet.topo import Topo
from mininet.link import TCLink
from mininet.topo import SingleSwitchTopo
from mininet.node import RemoteController
net = None
class FVTopo(Topo):
    def __init__(self):
        Topo.__init__(self)
        hconfig = {'inNamespace':True}
        for i in range(4):
            self.addHost('h%d' % (i+1), **hconfig)

        for i in range(2):
            sconfig = {'dpid': "%016x" % (i+1)}
            self.addSwitch('s%d' % (i+1), **sconfig)

        self.addLink('s1', 's2', port1=1, port2=1, bw=2)
        self.addLink('h1', 's1', port1=1, port2=2, bw=1)
        self.addLink('h2', 's1', port1=1, port2=3, bw=1)
        self.addLink('h3', 's2', port1=1, port2=2, bw=1)
        self.addLink('h4', 's2', port1=1, port2=3, bw=1)
        info( '\n*** printing and validating the ports running on each interface\n' )
def startNetwork():
    info('** Creating Overlay network topology\n')
    topo = FVTopo()
    global net
    net = Mininet(topo=topo, link = TCLink,controller=lambda name: RemoteController(name, ip='127.0.0.1'),listenPort=6633, autoSetMacs=True)
    info('** Starting the network\n')
    net.start()
    info('** Running CLI\n')
    CLI(net)
def stopNetwork():
    if net is not None:
        info('** Tearing down Overlay network\n')
        net.stop()
if __name__ == '__main__':
    atexit.register(stopNetwork)
    setLogLevel('info')
    startNetwork()
