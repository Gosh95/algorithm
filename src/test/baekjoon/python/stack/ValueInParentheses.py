parentheses = list(input())
stack = []
answer = 0
temp_num = 1

for i in range(len(parentheses)):
    p = parentheses[i]
    if p == '(':
        stack.append(p)
        temp_num *= 2
    if p == '[':
        stack.append(p)
        temp_num *= 3
    if p == ')':
        if not stack or stack[-1] == '[':
            answer = 0
            break
        if parentheses[i - 1] == '(':
            answer += temp_num
        stack.pop()
        temp_num //= 2
    if p == ']':
        if not stack or stack[-1] == '(':
            answer = 0
            break
        if parentheses[i - 1] == '[':
            answer += temp_num
        stack.pop()
        temp_num //= 3

if stack:
    print(0)
else:
    print(answer)
