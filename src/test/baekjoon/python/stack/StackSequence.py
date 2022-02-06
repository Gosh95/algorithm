N = int(input())
stack = []
symbol = []
idx = 1
for i in range(N):
    num = int(input())
    while idx <= num:
        stack.append(idx)
        idx += 1
        symbol.append("+")
    if stack[-1] == num:
        stack.pop()
        symbol.append("-")
    else:
        break
print("\n".join(symbol)) if len(stack) == 0 else print("NO")

