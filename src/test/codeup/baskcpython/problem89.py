a, r, n = input().split()

a = int(a)
r = int(r)
n = int(n)

while n != 1:
    n -= 1
    a *= r

print(a)