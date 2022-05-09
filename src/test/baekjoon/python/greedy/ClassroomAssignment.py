import heapq

N = int(input())
times = []
for _ in range(N):
    times.append(list(map(int, input().split())))

times.sort()

answer = []
heapq.heappush(answer, times[0][1])

for i in range(1, N):
    if times[i][0] >= answer[0]:
        heapq.heappop(answer)

    heapq.heappush(answer, times[i][1])

print(len(answer))