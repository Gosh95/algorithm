N = int(input())
start = N - (len(str(N)) * 9)
answer = 0
for i in range(start, N):
    if i < 1:
        continue

    _sum = num = i
    while num != 0:
        _sum += num % 10
        num //= 10
    if _sum == N:
        answer = i
        break
print(answer)

