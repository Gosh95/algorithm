N, M = map(int, input().split())
T = [int(input()) for _ in range(N)]

start = 1
end = max(T) * M

answer = 0
while start <= end:
    mid = (start + end) // 2
    total = 0
    for t in T:
        total += mid // t
    if total >= M:
        end = mid - 1
        answer = mid
    else:
        start = mid + 1

print(answer)