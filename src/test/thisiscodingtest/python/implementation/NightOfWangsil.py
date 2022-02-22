dx = [-2, -2, -1, 1, 2, 2, -1, 1]
dy = [-1, 1, 2, 2, -1, 1, -2, -2]
col, row = input()
col = ord(col) - ord('a') + 1
row = int(row)
answer = 0
for i in range(8):
    nx = row + dx[i]
    ny = col + dy[i]

    if nx < 1 or ny < 1 or nx > 8 or ny > 8:
        continue
    answer += 1
print(answer)


