from collections import deque

Y, X = map(int, input().split())
graph = []
queue = deque()
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
isZero = False
for i in range(X):
    item = list(map(int, input().split()))
    graph.append(item)
    for j in range(Y):
        if item[j] == 1:
            queue.append((i, j))

def bfs():
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or ny < 0 or nx >= X or ny >= Y:
                continue
            if graph[nx][ny] == 0 and graph[x][y] != 0:
                graph[nx][ny] = graph[x][y] + 1
                queue.append((nx, ny))

bfs()

answer = 0
for i in range(X):
    for j in range(Y):
        if graph[i][j] == 0:
            print(-1)
            exit(0)
        answer = max(graph[i][j], answer)

print(answer - 1)