For running we need to start the controller by invoking
./pox.py log.level --DEBUG misc.videoSlice from the ~/pox folder,
and run the mininet topology which is specified by mininetSlice.py
by running sudo python mininetSlice.py in another terminal.
Now we can start servers on tcp port 80 and tcp port 22 in the host 3
via h3 iperf -s -p 80 & and subsequently h3 iperf -s -p 22 &
h3 iperf -c h3 -p 80 -t 2 -i 1 : Expected result is packets flow through at a
rate of 10 Mbps approximately.
h3 iperf -c h3 -p 22 -t 2 -i 1 : Expected result is packets flow through at a
rate of 1 Mbps approximately.
