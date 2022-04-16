N = int(input())

dp = [0] * 1000001
dp[1] = 1
dp[2] = 2
dp[3] = 3
dp[4] = 4

for i in range(5, N + 1):
    dp[i] = (dp[i - 3] * 3) % 10007

print(dp[N])