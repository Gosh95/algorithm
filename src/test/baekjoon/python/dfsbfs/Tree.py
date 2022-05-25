n = int(input())
tree = list(map(int, input().split()))
k = int(input())
graph = [[] for _ in range(n)]
answer = 0
root = -1

def dfs(node):
    global answer
    if not graph[node]:
        answer += 1
        return

    children = graph[node]
    for i in range(len(children)):
        if children[i] == k:
            if len(children) == 1:
                answer += 1
            else:
                continue
        else:
            dfs(children[i])


for i in range(n):
    if tree[i] == -1:
        root = i
    else:
        graph[tree[i]].append(i)


if k == root:
    print(0)
else:
    dfs(root)
    print(answer)
