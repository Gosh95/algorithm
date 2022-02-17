from collections import deque

N, M = map(int, input().split())
maze = []
for i in range(N):
    maze.append(list(map(int, input())))

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(x, y):
    queue = deque()
    queue.append(x, y)

    while queue:
        x, y = queue.popleft()
        for j in range(4):
            nx = x + dx[j]
            ny = y + dy[j]

            if nx < 0 or nx >= N or ny < 0 or ny >= M:
                continue
            if maze[nx][ny] == 0:
                continue
            if maze[nx][ny] == 1:
                maze[nx][ny] = maze[x][y] + 1
                queue.append((nx, ny)) #한 쌍으로 나올 수 있도록 ()로 감싼다.
    return maze[N - 1][M - 1]

print(bfs(0, 0))



