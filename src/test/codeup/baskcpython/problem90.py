a, m, d, n = input().split()

a = int(a)
m = int(m)
d = int(d)
n = int(n)

while n != 1:
    n -= 1
    a = (a * m) + d

print(a)