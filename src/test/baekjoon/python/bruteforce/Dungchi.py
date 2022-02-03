N = int(input())
dungchi = []
rank = [1] * N
for i in range(N):
    dungchi.append(list(map(int, input().split())))
for i in range(N):
    for j in range(N):
        if i == j:
            continue
        if dungchi[i][0] < dungchi[j][0] and dungchi[i][1] < dungchi[j][1]:
            rank[i] += 1
for i in range(N):
    print(rank[i], end=" ")
