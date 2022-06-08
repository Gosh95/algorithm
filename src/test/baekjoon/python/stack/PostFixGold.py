formula = list(input())
stack = []
answer = []


def get_priority(symbol):
    if symbol == '(' or symbol == ')':
        return 0
    elif symbol == '*' or symbol == '/':
        return 2

    return 1

for f in formula:
    if 'A' <= f <= 'Z':
        answer.append(f)
    else:
        if f == '(':
            stack.append(f)
        elif f == ')':
            while stack and stack[-1] != '(':
                answer.append(stack.pop())

            stack.pop()
        else:
            while stack and get_priority(f) <= get_priority(stack[-1]):
                answer.append(stack.pop())

            stack.append(f)

while stack:
    answer.append(stack.pop())

print("".join(answer))
