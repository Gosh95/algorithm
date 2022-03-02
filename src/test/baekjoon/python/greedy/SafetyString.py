idx = 1
while True:
    stack = []
    count = 0
    item = input()
    if "-" in item:
        break
    for i in range(len(item)):
        if item[i] == "{":
            stack.append(item[i])
        else:
            if stack:
                stack.pop()
            else:
                count += 1
                stack.append("{")
    count += len(stack) // 2

    print(f"{idx}. {count}")
    idx += 1