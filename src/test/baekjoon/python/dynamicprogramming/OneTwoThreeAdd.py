T = int(input())
d = [0] * 11
d[1] = 1
d[2] = 2
d[3] = 4
def function(num):
    for i in range(4, num + 1):
        d[i] = d[i - 1] + d[i - 2] + d[i - 3]
    return d[num]

while T > 0:
    T -= 1
    num = int(input())
    print(function(num))