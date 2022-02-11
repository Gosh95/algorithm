N = int(input())
time = list(map(int, input().split()))
time.sort()

answer = 0
for i in range(N):
    for j in range(0, i + 1):
        answer += time[j]
print(answer)