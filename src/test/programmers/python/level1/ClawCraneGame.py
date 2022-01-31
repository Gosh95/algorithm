def solution(board, moves):
    bucket = []
    answer = 0
    moves = [i - 1 for i in moves]
    for pick in moves:
        if board[len(board) - 1][pick] == 0:
            continue
        row = 0
        while board[row][pick] == 0:
            row += 1
        bucket.append(board[row][pick])
        board[row][pick] = 0

        if len(bucket) > 1:
            if bucket[-1] == bucket[-2]:
                bucket.pop(-1)
                bucket.pop(-1)
                answer += 2

    return answer

# board = [[0,0,0,0,0],
#          [0,0,1,0,3],
#          [0,2,5,0,1],
#          [4,2,4,4,2],
#          [3,5,1,3,1]]
# moves = [1,5,3,5,1,2,1,4]
# print(solution(board, moves))