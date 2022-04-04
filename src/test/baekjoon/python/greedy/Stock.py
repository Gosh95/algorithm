T = int(input())

for _ in range(T):
    N = int(input())
    answer = 0
    prices = list(map(int, input().split()))

    while prices:
        price = prices.pop()

        for i in range(len(prices) - 1, -1, -1):
            if price >= prices[i]:
                answer += (price - prices.pop())
            else:
                break

    print(answer)