N = int(input())
k = int(input())
start, end = 1, k
answer = 0
while start <= end:
    count = 0
    mid = (start + end) // 2
    for i in range(1, N + 1):
        count += min(mid // i, N)
    if count >= k:
        answer = mid
        end = mid - 1
    else:
        start = mid + 1
print(answer)

