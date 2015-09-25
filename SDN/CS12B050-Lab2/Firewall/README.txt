Run ./pox.py forwarding.l2_learning misc.firewall which acts as a controller.
Now run sudo mn --mac --topo=single,10 --controller=remote.
We can check h1 ping h8 and verify that the packet indeed has been
dropped (Mac address 00:00:00:01 as source and 00:00:00:08 as destination
is supposed to be dropped as per the policies file). The
policies file can be modified to check various other firewalling as well.
