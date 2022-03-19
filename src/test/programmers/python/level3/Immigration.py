def solution(n, times):
    answer = 0
    start = 1
    end = max(times) * n

    while start <= end:
        mid = (start + end) // 2
        total = 0
        for t in times:
            total += mid // t
        if total >= n:
            end = mid - 1
            answer = mid
        else:
            start = mid + 1
    return answer