N, M = map(int, input().split())
tteoks = list(map(int, input().split()))

start = 0
end = max(tteoks)
answer = 0
while start <= end:
    total = 0
    mid = (start + end) // 2
    for i in tteoks:
        if i > mid:
            total += i - mid
    if total < M:
        end = mid - 1
    else:
        answer = mid
        start = mid + 1
print(answer)

