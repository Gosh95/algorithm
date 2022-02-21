N = int(input())
tops = list(map(int, input().split()))
stack = []
result = [0] * N
for i in range(N - 1, -1, -1):
    while stack and tops[stack[-1]] < tops[i]:
        result[stack.pop()] = (i + 1)
    stack.append(i);
print(*result)