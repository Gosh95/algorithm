n = int(input())
arr = []
stack = []
is_correct = True

for i in range(n):
    values = list(map(int, input().split()))
    start = values[0] - values[1]
    end = values[0] + values[1]

    arr.append((start, i, 0))
    arr.append((end, i, 1))

arr.sort()

for i in range(n):
    if arr[i][2] == 0:
        stack.append(arr[i])
    else:
        if stack[-1][1] == arr[i][1]:
            stack.pop()
        else:
            is_correct = False

            break

print("YES") if is_correct else print("NO")
