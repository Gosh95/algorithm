def solution(lottos, win_nums):
    rank = [6, 6, 5, 4, 3, 2, 1]
    match_num = 0
    for i in range(len(lottos)):
        if lottos[i] in win_nums:
            match_num += 1
    low = match_num
    high = match_num + lottos.count(0)

    return [rank[high], rank[low]]

# print(solution([0, 0, 0, 0, 0, 0], [31, 10, 45, 1, 6, 19]))


