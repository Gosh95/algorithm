data = int(input(), 16)

for i in range(1, 16):
    print("%X*" % data + "%X=" % i + "%X" % (data * i))
