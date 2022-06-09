import heapq
import sys

n = int(sys.stdin.readline())
arr = []
answer = []

for i in range(n):
    num = int(sys.stdin.readline())

    heapq.heappush(arr, -num)

    if num == 0:
        answer.append(abs(heapq.heappop(arr)))

for a in answer:
    print(a)
