N, K = map(int, input().split())
nums = list(input())
count, stack = K, []

for i in range(N):
    while count > 0 and stack and stack[-1] < nums[i]:
        stack.pop()
        count -= 1
    stack.append(nums[i])

print("".join(stack[:N - K]))