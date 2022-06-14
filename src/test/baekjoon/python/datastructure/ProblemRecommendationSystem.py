import sys
import heapq

input = sys.stdin.readline
n = int(input())

min_heap = []
max_heap = []
visited = [False] * 100_001


for _ in range(n):
    problem, difficulty = map(int, input().split())

    heapq.heappush(min_heap, (difficulty, problem))
    heapq.heappush(max_heap, (-difficulty, -problem))
    visited[problem] = True

m = int(input())

for _ in range(m):
    operation = input().split()

    if operation[0] == "recommend":
        if operation[1] == '1':
            while max_heap and not visited[-max_heap[0][1]]:
                heapq.heappop(max_heap)

            if max_heap:
                print(-max_heap[0][1])
        elif operation[1] == '-1':
            while min_heap and not visited[min_heap[0][1]]:
                heapq.heappop(min_heap)

            if min_heap:
                print(min_heap[0][1])
    elif operation[0] == "solved":
        visited[int(operation[1])] = False
    else:
        problem, difficulty = int(operation[1]), int(operation[2])

        while min_heap and not visited[min_heap[0][1]]:
            heapq.heappop(min_heap)

        while max_heap and not visited[-max_heap[0][1]]:
            heapq.heappop(max_heap)

        heapq.heappush(min_heap, (difficulty, problem))
        heapq.heappush(max_heap, (-difficulty, -problem))
        visited[problem] = True
