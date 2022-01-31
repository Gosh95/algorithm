def solution(n, lost, reserve):
    a = [1] * n
    for i in lost:
        a[i - 1] -= 1
    for i in reserve:
        a[i - 1] += 1
    for i in range(n):
        if a[i] == 0:
            if i > 0 and a[i - 1] == 2:
                a[i - 1] -= 1
                a[i] += 1
            elif i < n - 1 and a[i + 1] == 2:
                a[i + 1] -= 1
                a[i] += 1
            else:
                continue
    return n - a.count(0)

print(solution(3, [3], [1]))
