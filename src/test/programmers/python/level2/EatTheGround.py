def solution(land):
    answer, idx, column_size = 0, 0, 4
    is_eaten = [False] * column_size
    for line in land:
        max_num = -1
        for i in range(column_size):
            if is_eaten[i] is False:
                max_num = max(max_num, line[i])
            else:
                continue
        max_idx = line.index(max_num)
        is_eaten = [True if i is max_idx else False for i in range(column_size)]
        answer += max_num

    return answer

# def solution(land):
#     for i in range(1, len(land)):
#         land[i][0] += max(max(land[i - 1][1], land[i - 1][2]), land[i - 1][3])
#         land[i][1] += max(max(land[i - 1][0], land[i - 1][2]), land[i - 1][3])
#         land[i][2] += max(max(land[i - 1][1], land[i - 1][0]), land[i - 1][3])
#         land[i][3] += max(max(land[i - 1][1], land[i - 1][2]), land[i - 1][0])
#
#     return max(land[-1])

print(solution([[1, 1, 2, 2], [3, 3, 4, 4], [3, 3, 4, 4], [5, 5, 6, 6], [6, 6, 5, 5], [9, 9, 10, 10]]))