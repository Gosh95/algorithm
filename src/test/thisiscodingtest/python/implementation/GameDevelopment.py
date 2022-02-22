N, M = map(int, input().split())
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
x, y, d = map(int, input().split())
game_map = []
for i in range(N):
    game_map.append(list(map(int, input().split())))

game_map[x][y] = 1

def turn_left():
    global d
    d -= 1
    if d < 0:
        d = 3

answer = 1
turn_time = 0
while True:
    turn_left()

    nx = x + dx[d]
    ny = y + dy[d]

    if game_map[nx][ny] == 0:
        game_map[nx][ny] = 1
        x = nx
        y = ny
        answer += 1
        turn_time = 0
        continue
    else:
        turn_time += 1

    if turn_time == 4:
        nx = x - dx[d]
        ny = y - dy[d]

        if game_map[nx][ny] == 0:
            x = nx
            y = ny
        else:
            break
        turn_time = 0

print(answer)



