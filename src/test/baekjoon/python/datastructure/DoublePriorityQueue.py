import sys
import heapq

input = sys.stdin.readline
t = int(input())

for _ in range(t):
    k = int(input())
    min_heap, max_heap = [], []
    visit = [False] * 1_000_001

    for i in range(k):
        operation, value = input().split()

        if operation == 'I':
            heapq.heappush(min_heap, (int(value), i))
            heapq.heappush(max_heap, (-1 * int(value), i))

        elif operation == 'D':
            if value == '-1':
                while min_heap and visit[min_heap[0][1]]:
                    heapq.heappop(min_heap)

                if min_heap:
                    visit[min_heap[0][1]] = True
                    heapq.heappop(min_heap)
            elif value == '1':
                while max_heap and visit[max_heap[0][1]]:
                    heapq.heappop(max_heap)

                if max_heap:
                    visit[max_heap[0][1]] = True
                    heapq.heappop(max_heap)

    while min_heap and visit[min_heap[0][1]]:
        heapq.heappop(min_heap)

    while max_heap and visit[max_heap[0][1]]:
        heapq.heappop(max_heap)

    if min_heap and max_heap:
        print(-max_heap[0][0], min_heap[0][0])
    else:
        print("EMPTY")
