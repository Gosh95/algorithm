import heapq

N = int(input())
arr = []
for _ in range(N):
    day, score = map(int, input().split())
    arr.append([-score, day, score])

heapq.heapify(arr)

answer = [0] * 1001

while arr:
    items = heapq.heappop(arr)
    for i in range(items[1], 0, -1):
        if answer[i] == 0:
            answer[i] = items[2]
            break

print(sum(answer))