H, W = map(int, input().split())
block = list(map(int, input().split()))

answer = 0
for i in range(1, W - 1):
    max_left = max(block[:i])
    max_right = max(block[i + 1:])
    print(max_left, max_right)

    min_num = min(max_left, max_right)
    print(min_num)

    if block[i] < min_num:
        answer += min_num - block[i]

print(answer)