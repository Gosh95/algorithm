n = int(input())
formula = list(input())
answer = []
nums = [int(input()) for _ in range(n)]


def calc(a, b, symbol):
    if symbol == "+":
        return a + b
    elif symbol == "-":
        return a - b
    elif symbol == "*":
        return a * b
    else:
        return a / b


for f in formula:
    idx = ord(f) - ord('A')
    if 0 <= idx <= 26:
        answer.append(nums[idx])
    else:
        if len(answer) >= 2:
            b = answer.pop()
            a = answer.pop()
            answer.append(calc(a, b, f))

print("{:.2f}".format(answer[0]))
