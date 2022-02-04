N, K = map(int, input().split())
coins = []
answer = 0

for i in range(N):
    coins.append(int(input()))

coins = sorted(coins, reverse=True)

for i in range(len(coins)):
    if coins[i] > K:
        continue
    answer += K // coins[i]
    K %= coins[i]
    if K < 1:
        break

print(answer)






