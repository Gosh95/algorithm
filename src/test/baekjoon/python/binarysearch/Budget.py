N = int(input())
requests = list(map(int, input().split()))
max_budget = int(input())
requests.sort()

def binary_search(start, end):
    while start <= end:
        mid = (start + end) // 2
        total = 0
        for i in requests:
            if i > mid:
                total += mid
                continue
            total += i
        if total <= max_budget:
            start = mid + 1
        else:
            end = mid - 1
    return end

start = 1
end = max(requests)

if sum(requests) > max_budget:
    print(binary_search(start, end))
else:
    print(end)