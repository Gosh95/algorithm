def solution(n, computers):
    answer = 0
    visited = [False for _ in range(n)]
    for i in range(n):
        if visited[i] is False:
            dfs(n, computers, visited, i)
            answer += 1
    return answer

def dfs(n, computers, visited, i):
    visited[i] = True
    for j in range(n):
        if visited[j] is False and computers[i][j] == 1:
            dfs(n, computers, visited, j)