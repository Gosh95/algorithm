N = int(input())
nums = sorted(list(map(int, input().split())))
M = int(input())
targets = list(map(int, input().split()))

def binary_search(arr, target, start, end):
    while start <= end:
        mid = (start + end) // 2
        if arr[mid] == target:
            return 1
        elif arr[mid] > target:
            end = mid - 1
        elif arr[mid] < target:
            start = mid + 1
    return 0

for i in targets:
    print(binary_search(nums, i, 0, N - 1))
