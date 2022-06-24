import sys

input = sys.stdin.readline
k = int(input())
buildings = list(map(int, input().split()))
tree = [[] for _ in range(k)]


def to_tree(arr, n):
    root = len(arr) // 2
    tree[n].append(arr[root])

    if len(arr) == 1:
        return

    to_tree(arr[:root], n + 1)
    to_tree(arr[root + 1:], n + 1)


to_tree(buildings, 0)

for t in tree:
    print(*t)
