def solution(s):
    stack = []
    for i in s:
        if i == '(':
            stack.append(i)
        if stack and i == ')':
            stack.pop()
        elif not stack and i == ')':
            return False

    return False if stack else True

print(solution(")()("))

