from collections import deque

n = int(input())

tree_list = [[] for _ in range(n + 1)]

for _ in range(n - 1):
    x, y = map(int, input().split())

    tree_list[x].append(y)
    tree_list[y].append(x)

answer = [0] * (n + 1)


def bfs():
    queue = deque()
    queue.append(1)

    while queue:
        parent = queue.popleft()

        for t in tree_list[parent]:
            if answer[t] == 0:
                answer[t] = parent
                queue.append(t)


bfs()

for a in answer[2:]:
    print(a)
