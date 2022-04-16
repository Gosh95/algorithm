A = int(input())
sequences = list(map(int, input().split()))
dp = [1] * 1001

for i in range(A):
    for j in range(i):
        if sequences[i] > sequences[j]:
            dp[i] = max(dp[i], dp[j] + 1)

print(max(dp))