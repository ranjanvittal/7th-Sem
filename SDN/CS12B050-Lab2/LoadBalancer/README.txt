Run ./pox.py forwarding.l2_learning misc.ip_loadbalancer --servers=10.0.0.2,10.0.0.3 --ip=10.0.1.1 which acts as a controller. Here --servers option is used
to specify the various servers and --ip option is used to specify the switch.
Now run sudo mn --mac --topo=single,10 --controller=remote.
We can try out opening a server in both h2 and h3 which refers to the
servers as per the test and access the server from various nodes
(via wget or curl). We can see
that the load is shared between the two servers based on the ip.
