def check_bracket(sentence):
    stack = []
    for i in range(len(sentence)):
        char = sentence[i]
        if char == '(' or char == '[':
            stack.append(char)

        if char == ')':
            if len(stack) != 0 and stack[-1] == '(':
                stack.pop()
            else:
                return False
        elif char == ']':
            if len(stack) != 0 and stack[-1] == '[':
                stack.pop()
            else:
                return False
    return True if len(stack) == 0 else False

isRun = True
while isRun:
    sentence = input()
    if sentence == ".":
        isRun = False
    else:
        print("yes") if check_bracket(sentence) else print("no")






