def solution(s):
    zero_count, try_count = 0, 0
    while len(s) != 1:
        zero_count += s.count('0')
        s = s.replace('0', '')
        try_count += 1
        s = bin(len(s))[2:]

    return [try_count, zero_count]

print(solution("110010101001"))