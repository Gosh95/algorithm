from collections import deque

n, m = map(int, input().split())
board = [list(map(int, input().split())) for _ in range(n)]
q = deque()
answer = 0
is_zero = False
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def melt(a, b):
    for i in range(4):
        nx = a + dx[i]
        ny = b + dy[i]

        if nx < 0 or ny < 0 or nx >= n or ny >= m:
            continue

        if board[nx][ny] == 0 and visited[nx][ny] is False:
            if board[a][b] > 0:
                board[a][b] -= 1


def bfs(a, b):
    q.append((a, b))

    while q:
        x, y = q.popleft()
        visited[x][y] = True

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or ny < 0 or nx >= n or ny >= m:
                continue

            if board[nx][ny] != 0 and visited[nx][ny] is False:
                visited[nx][ny] = True
                q.append((nx, ny))

while True:
    visited = [[False] * m for _ in range(n)]
    answer += 1
    count = 0

    for i in range(n):
        for j in range(m):
            if board[i][j] != 0 and visited[i][j] is False:
                visited[i][j] = True
                melt(i, j)

    visited = [[False] * m for _ in range(n)]
    for i in range(n):
        for j in range(m):
            if board[i][j] != 0 and visited[i][j] is False:
                bfs(i, j)
                count += 1

    if count >= 2:
        break
    if count == 0:
        is_zero = True
        break

if is_zero:
    print(0)
else:
    print(answer)
