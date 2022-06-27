n = int(input())
tips = [int(input()) for _ in range(n)]
tips.sort(reverse=True)
answer = 0

for i in range(1, n + 1):
    tip = tips[i - 1] - (i - 1)

    if tip > 0:
        answer += tip

print(answer)
