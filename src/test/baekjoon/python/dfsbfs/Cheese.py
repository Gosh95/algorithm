from collections import deque

n, m = map(int, input().split())
cheeses = [list(map(int, input().split())) for _ in range(n)]
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]


def bfs():
    q = deque()
    q.append((0, 0))
    visited = [[False] * m for _ in range(n)]
    visited[0][0] = True

    while q:
        x, y = q.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or ny < 0 or nx >= n or ny >= m:
                continue

            if visited[nx][ny] is False:
                if cheeses[nx][ny] >= 1:
                    cheeses[nx][ny] += 1
                else:
                    visited[nx][ny] = True
                    q.append((nx, ny))


answer = 0

while True:
    bfs()
    melted = False

    for i in range(n):
        for j in range(m):
            if cheeses[i][j] >= 3:
                cheeses[i][j] = 0
                melted = True
            elif cheeses[i][j] == 2:
                cheeses[i][j] = 1

    if melted:
        answer += 1
    else:
        break

print(answer)
