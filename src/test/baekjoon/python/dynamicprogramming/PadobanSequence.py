T = int(input())
d = [0] * 101
d[1] = 1
d[2] = 1
d[3] = 1

def function(num):
    for i in range(4, num + 1):
        d[i] = d[i - 2] + d[i - 3]
    return d[num]

while T > 0:
    T -= 1
    print(function(int(input())))
