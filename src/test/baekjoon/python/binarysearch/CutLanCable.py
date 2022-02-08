import sys
N, K = map(int, sys.stdin.readline().split())
nums = []
for i in range(N):
    nums.append(int(sys.stdin.readline()))
def binary_search(start, end):
    while start <= end:
        total = 0
        mid = (start + end) // 2
        for x in nums:
            total += x // mid
        if total >= K:
            start = mid + 1
        elif total < K:
            end = mid - 1
    return end

print(binary_search(1, max(nums)))
