def solution(a, b):
    answer = 0
    for i, j in zip(a, b):
        answer += (i * j)
    return answer

# def solution(absolutes, signs):
#     return sum(absolute if sign else -absolute for absolute, sign in zip(absolutes, signs))

# print(solution([4,7,12], [True,False,True]))
