def solution(n, left, right):
    result = []
    for i in range(int(left), int(right + 1)):
        result.append(max(i // n, i % n) + 1)
    return result

print(solution(3, 2, 5))


