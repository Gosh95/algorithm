def solution(n):
    arr = list(map(int, list(str(n))))
    return sum([i for i in arr])

print(solution(123))