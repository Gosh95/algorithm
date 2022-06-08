from itertools import combinations

formula = input()
stack = []
pos = []
answer = set()

for i in range(len(formula)):
    if formula[i] == "(":
        stack.append(i)

    if formula[i] == ")":
        x = stack.pop()
        y = i
        pos.append((x, y))

for i in range(1, len(pos) + 1):
    combination = combinations(pos, i)

    for value in combination:
        temp = list(formula)

        for v in value:
            x, y = v
            temp[x] = ""
            temp[y] = ""

        answer.add("".join(temp))

print("\n".join(sorted(answer)))
