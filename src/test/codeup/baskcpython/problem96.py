d = []

for i in range(19):
    d.append([])
    nums = input().split()

    for j in range(19):
        d[i].append(int(nums[j]))

n = int(input())

for i in range(n):
    pos = input().split()

    x = int(pos[0]) - 1
    y = int(pos[1]) - 1

    for j in range(19):
        if d[j][y] == 1:
            d[j][y] = 0
        else:
            d[j][y] = 1

        if d[x][j] == 1:
            d[x][j] = 0
        else:
            d[x][j] = 1

for i in range(19):
    for j in range(19):
        print(d[i][j], end=' ')
    print()