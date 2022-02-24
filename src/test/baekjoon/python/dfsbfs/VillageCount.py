N = int(input())
find_x, find_y = map(int, input().split())
graph = [list([]) for _ in range(101)]
visited = [False] * 101
M = int(input())
for _ in range(M):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

answer = -1
def dfs(graph, visited, pos, find, count):
    visited[pos] = True

    for i in graph[pos]:
        if visited[i] is False:
            if i == find:
                global answer
                answer = count + 1
                return
            dfs(graph, visited, i, find, count + 1)

dfs(graph, visited, find_x, find_y, 0)
print(answer)
