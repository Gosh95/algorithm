n, m = map(int, input().split())
str_set = set([input() for _ in range(n)])
answer = 0

for _ in range(m):
    value = input()

    if value in str_set:
        answer += 1

print(answer)
