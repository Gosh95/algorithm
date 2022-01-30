def solution(n):
    a = [0] * (n + 1)
    for i in range(2, len(a)):
        for j in range(2, len(a)):
            idx = i * j
            if idx > n:
                break
            a[idx] = 1
    return a[2:].count(0)

