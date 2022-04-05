N, K = map(int, input().split())
heights = list(map(int, input().split()))
arr = []
for i in range(1, N):
    arr.append(heights[i] - heights[i - 1])
print(sum(sorted(arr)[:N - K]))