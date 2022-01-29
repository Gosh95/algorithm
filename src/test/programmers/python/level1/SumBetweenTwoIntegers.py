def solution(a, b):
    a, b = min(a, b), max(a, b)
    return sum([i for i in range(a, b + 1)])

