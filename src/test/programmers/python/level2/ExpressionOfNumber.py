def solution(n):
    answer = 1
    limit = n // 2 + 1
    for i in range(1, limit):
        _sum, num = 0, i
        while _sum <= n:
            _sum += num
            num += 1
            if _sum == n:
                answer += 1
                break

    return answer

print(solution(15))