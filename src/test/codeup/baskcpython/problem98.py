x, y = 1, 1

matrix = []

for i in range(10):
    matrix.append([])
    pos = input().split()

    for j in range(10):
        matrix[i].append(int(pos[j]))

right = [0, 1]
down = [1, 0]

matrix[x][y] = 9
while True:
    dX = -1
    dY = -1

    dX = x + right[0]
    dY = y + right[1]

    if matrix[dX][dY] == 2:
        matrix[dX][dY] = 9
        break

    if matrix[dX][dY] == 0:
        matrix[dX][dY] = 9
        x = dX
        y = dY

    else:
        dX = x + down[0]
        dY = y + down[1]

        if matrix[dX][dY] == 2:
            matrix[dX][dY] = 9
            break
        elif matrix[dX][dY] == 0:
            matrix[dX][dY] = 9
            x = dX
            y = dY

        else:
            break

for i in range(10):
    for j in range(10):
        print(matrix[i][j], end=' ')
    print()


