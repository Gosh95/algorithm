N, M = map(int, input().split())

result = 0
for i in range(N):
    items = list(map(int, input().split()))
    min_value = 10001
    for item in items:
        min_value = min(item, min_value)
    result = max(min_value, result)


print(result)