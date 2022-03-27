N = int(input())
coins = sorted(list(map(int, input().split())))
answer = 1
for c in coins:
    if answer < c:
        break
    answer += c
print(answer)