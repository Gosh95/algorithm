n, m = map(int, input().split())
graph = [[] for _ in range(n)]
visited = [False] * n
is_correct = False

for _ in range(m):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)


def dfs(idx, count):
    global is_correct

    if count == 4:
        is_correct = True
        return

    visited[idx] = True

    for i in graph[idx]:
        if visited[i] is False:
            dfs(i, count + 1)

    visited[idx] = False


for i in range(n):
    dfs(i, 0)

    if is_correct:
        break

if is_correct:
    print(1)
else:
    print(0)
