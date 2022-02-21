N = int(input())
weights = list(map(int, input().split()))
weights.sort()
answer = 0
for weight in weights:
    if answer + 1 < weight:
        break
    answer += weight
print(answer + 1)


