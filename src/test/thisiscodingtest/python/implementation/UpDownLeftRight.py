N = int(input())
direction = {
    "L": [0, -1],
    "R": [0, 1],
    "U": [-1, 0],
    "D": [1, 0],
}

plans = input().split()

x, y = 0, 0
for i in plans:
    d = direction[i]
    nx = x + d[0]
    ny = y + d[1]

    if nx < 0 or ny < 0 or nx >= N or ny >= N:
        continue
    x, y = nx, ny

print(x + 1, y + 1)

