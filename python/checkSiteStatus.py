import socket
import os

TARGET_HOST = "twinnation.org"
PORTS = [443, 80, 22]

print "Checking status for host: " + TARGET_HOST

for i in range(0, len(PORTS)):
    sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    if sock.connect_ex((TARGET_HOST, PORTS[i])) == 0:
        print "Port " + str(PORTS[i]) + " is open"
    else:
        print "Port " + str(PORTS[i]) + " is closed"
    sock.close()
    
os.system('pause')
