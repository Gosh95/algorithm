h, w = input().split()
h = int(h)
w = int(w)

matrix = []

for i in range(h):
    matrix.append([])

    for j in range(w):
        matrix[i].append(0)

n = int(input())

for i in range(n):
    i, d, x, y = input().split()
    i = int(i)
    d = int(d)
    x = int(x) - 1
    y = int(y) - 1

    if d == 0:
        for j in range(i):
            matrix[x][y + j] = 1
    else:
        for k in range(i):
            matrix[x + k][y] = 1

for i in range(h):
    for j in range(w):
        print(matrix[i][j], end=' ')
    print()

