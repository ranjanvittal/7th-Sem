from mininet.topo import Topo

class CustomTopo(Topo):
    def __init__(
	self, 
	linkopts1 = dict(bw=10, delay='5ms', loss=1, max_queue_size=1000, use_htb=True), 
	linkopts2 = dict(bw=10, delay='4ms', loss=1, max_queue_size=1000, use_htb=True), 
	linkopts3 = dict(bw=10, delay='3ms', loss=1, max_queue_size=1000, use_htb=True), 
	fanout=2, **opts):
        Topo.__init__(self, **opts)
        self.fanout = fanout
        host = [1]
        e_switch = [1]
        a_switch = [1]
        c_switch = [1]
        for i in range(1, fanout*fanout*fanout+1):
            host.append(self.addHost('h%s' % i))

        for i in range(1, fanout*fanout+1):
            switch = self.addSwitch('e%s' % i)
            for j in range(1, fanout+1) :
                self.addLink(host[(i-1)*fanout + j], switch, **linkopts3)
            e_switch.append(switch)

        for i in range(1, fanout+1):
            switch = self.addSwitch('a%s' % i)
            for j in range(1, fanout+1) :
                self.addLink(e_switch[(i-1)*fanout + j], switch, **linkopts2)
            a_switch.append(switch)

        for i in range(1, 2) :
            switch = self.addSwitch('c%s' % i)
            for j in range(1, fanout+1) :
                self.addLink(a_switch[(i-1)*fanout + j], switch, **linkopts1)
            c_switch.append(switch)



topos = { 'custom': ( lambda: CustomTopo() ) }

