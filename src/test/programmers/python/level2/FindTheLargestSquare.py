def solution(board):
    answer = 0
    for i in range(1, len(board)):
        for j in range(1, len(board[i])):
            if board[i][j] != 0:
                board[i][j] += min(min(board[i - 1][j - 1], board[i - 1][j]), board[i][j - 1])
    for i in board:
        if answer < max(i):
            answer = max(i)
    return answer ** 2

print(solution([[0,1],
                [1,1]]))