arr = list(input())
stack = []
answer = 0
idx = 0

while idx != len(arr):
    if arr[idx] == "(" and arr[idx + 1] == ")":
        answer += len(stack)
        idx += 2

        continue

    if arr[idx] == "(":
        stack.append("(")
        answer += 1
    elif stack and arr[idx] == ")":
        stack.pop()

    idx += 1

print(answer)
