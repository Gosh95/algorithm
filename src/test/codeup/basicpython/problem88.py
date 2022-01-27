a, d, n = input().split()

a = int(a)
d = int(d)
n = int(n)

while n != 1:
    n -= 1
    a += d

print(a)