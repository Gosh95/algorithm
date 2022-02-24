N = int(input())
parts = sorted(list(map(int, input().split())))
M = int(input())
find = list(map(int, input().split()))

def binary_search(arr, target, start, end):
    while start <= end:
        mid = (start + end) // 2
        if arr[mid] == target:
            return "yes"
        elif arr[mid] > target:
            end = mid - 1
        else:
            start = mid + 1
    return "no"

start = 0
end = N - 1

for target in find:
    print(binary_search(parts, target, start, end), end=" ")
