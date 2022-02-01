N, M = map(int, input().split())
cards = list(map(int, input().split()))
answer = 0
for i in range(len(cards) - 2):
    for j in range(i + 1, len(cards) - 1):
        for k in range(j + 1, len(cards)):
            _sum = cards[i] + cards[j] + cards[k]
            if _sum > M:
                continue
            elif _sum == M:
                answer = _sum
                break
            else:
                answer = max(answer, _sum)

print(answer)
