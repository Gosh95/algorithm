n = int(input())

prices = [int(input()) for _ in range(n)]
prices.sort(reverse=True)

answer = 0

for i in range(n):
    if i % 3 != 2:
        answer += prices[i]

print(answer)
