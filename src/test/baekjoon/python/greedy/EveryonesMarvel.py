n = int(input())
cards = sorted(list(map(int, input().split())), reverse=True)

answer = 0
for i in range(1, n):
    answer += cards[0] + cards[i]

print(answer)