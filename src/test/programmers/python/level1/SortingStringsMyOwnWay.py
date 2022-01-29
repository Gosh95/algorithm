def solution(strings, n):
    a = list([i[n] + i for i in strings])
    a.sort()
    return list([i[1:] for i in a])

print(solution(["abce", "abcd", "cdx"], 2))