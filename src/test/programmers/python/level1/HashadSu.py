def solution(x):
    x = str(x)
    a = 0
    for i in range(len(x)):
        a += int(x[i])
    return True if int(x) % a == 0 else False

# 다른 사람 풀이
# def solution(x):
#     return x % sum([int(i) for i in str(x)]) == 0

