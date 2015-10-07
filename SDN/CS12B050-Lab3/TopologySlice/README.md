For running we need to start the controller by invoking
 ./pox.py log.level --DEBUG misc.topologySlice from the ~/pox folder,
and run the mininet topology which is specified by mininetSlice.py
by running sudo python mininetSlice.py in another terminal.
Now we can try pingall in the second terminal (mininet one).
We can see that h1 can ping h3, h2 can ping h4 and vice versa
while all other pings are dropped. This ensures that the two slices
cannot talk with each other.
