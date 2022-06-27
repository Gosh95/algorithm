n = int(input())
drinks = sorted(list(map(int, input().split())))
answer = drinks[-1] + (sum(drinks[:-1]) / 2)

print(answer)
