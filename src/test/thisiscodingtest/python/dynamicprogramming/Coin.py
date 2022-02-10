N, M = map(int, input().split())
array = []
for i in range(N):
    array.append(int(input()))
d = [10001] * (M + 1)  # 0 - M까지
d[0] = 0
for i in range(N):
    for j in range(array[i], M + 1):
        if d[j - array[i]] != 10001:
            d[j] = min(d[j], d[j - array[i]] + 1)
    print()
if d[M] != 10001:
    print(d[M])
else:
    print(-1)