def solution(n):
    one_count = bin(n)[2:].count('1')
    next_num = n + 1
    while True:
        if one_count == bin(next_num)[2:].count('1'):
            return next_num
        next_num += 1

print(solution(78))