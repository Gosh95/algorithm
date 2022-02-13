N = int(input())
distance = list(map(int, input().split()))
prices = list(map(int, input().split()))
low_price = prices[0]
answer = low_price * distance[0]
for i in range(1, N - 1):
    low_price = min(low_price, prices[i])
    answer += low_price * distance[i]

print(answer)


