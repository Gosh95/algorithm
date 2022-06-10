import heapq
import sys

n = int(sys.stdin.readline())
arr = []

for _ in range(n):
    nums = list(map(int, sys.stdin.readline().split()))

    if arr:
        for num in nums:
            if arr[0] < num:
                heapq.heappop(arr)
                heapq.heappush(arr, num)
    else:
        for num in nums:
            heapq.heappush(arr, num)

print(arr[0])
