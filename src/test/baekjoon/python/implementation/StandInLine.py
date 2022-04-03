N = int(input())
arr = list(map(int, input().split()))
lines = [0] * N
for n in range(1, N + 1):
    idx = arr[n - 1]
    zero_count = 0
    for i in range(N):
        if zero_count == idx and lines[i] == 0:
            lines[i] = n
            break
        elif lines[i] == 0:
            zero_count += 1
print(*lines)