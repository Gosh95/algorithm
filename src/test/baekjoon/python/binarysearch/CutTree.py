N, M = map(int, input().split())
trees = list(map(int, input().split()))
start = 1
end = max(trees)
def binary_search(arr, start, end):
    while start <= end:
        m_tree = 0
        mid = (start + end) // 2
        for x in arr:
            if x >= mid:
                m_tree += x - mid
        if m_tree >= M:
            start = mid + 1
        else:
            end = mid - 1
    return end
print(binary_search(trees, start, end))




