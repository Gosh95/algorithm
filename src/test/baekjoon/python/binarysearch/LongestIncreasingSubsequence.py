N = int(input())
result = [0]
def binary_search(target, start, end):
    while start <= end:
        mid = (start + end) // 2
        if result[mid] < target:
            start = mid + 1
        else:
            end = mid - 1
    return start

subsequence = list(map(int, input().split()))
for i in subsequence:
    if result[-1] < i:
        result.append(i)
    else:
        result[binary_search(i, 0, len(result) - 1)] = i

print(len(result) - 1)

