N, M = map(int, input().split())
chess_board = []
result = []
for i in range(N):
    chess_board.append(input())

for a in range(N - 7):
    for b in range(M - 7):
        a_idx = 0
        b_idx = 0
        for i in range(a, a + 8):
            for j in range(b, b + 8):
                if (i + j) % 2 == 0:
                    if chess_board[i][j] == 'W':
                        a_idx += 1
                    if chess_board[i][j] == 'B':
                        b_idx += 1
                else:
                    if chess_board[i][j] == 'B':
                        a_idx += 1
                    if chess_board[i][j] == 'W':
                        b_idx += 1
        result.append(min(a_idx, b_idx))

print(min(result))
