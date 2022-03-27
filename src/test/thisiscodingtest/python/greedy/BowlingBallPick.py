N, M = map(int, input().split())
weights = list(map(int, input().split()))

arr = [0] * 11
for w in weights:
    arr[w] += 1

answer = 0
for i in range(1, M + 1):
    N -= arr[i]
    answer += arr[i] * N
print(answer)