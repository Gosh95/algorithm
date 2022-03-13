N = int(input())
K = int(input())
sensors = sorted(list(map(int, input().split())), reverse=True)

if N < K:
    print(0)
    exit(0)

answer = []
for i in range(N - 1):
    answer.append(sensors[i] - sensors[i + 1])

for _ in range(K - 1):
    answer.remove(max(answer))

print(sum(answer))