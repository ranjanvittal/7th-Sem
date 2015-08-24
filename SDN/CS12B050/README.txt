chmod u+x CustomTopo.py
sudo mn --custom ~/mininet/custom/CustomTopo.py --link tc --topo custom --test pingall > output.txt 2>&1
