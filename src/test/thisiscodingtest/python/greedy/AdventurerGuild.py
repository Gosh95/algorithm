N = int(input())
fears = sorted(list(map(int, input().split())))
answer = 0
count = 0
for f in fears:
    count += 1
    if count >= f:
        answer += 1
        count = 0
print(answer)