N, M = map(int, input().split())
arr = list(map(int, input().split()))
start, end = 0, 0

answer = 0
while end <= N and start <= end:
    sum_of_nums = sum(arr[start:end])

    if sum_of_nums == M:
        answer += 1
        start += 1
    elif sum_of_nums > M:
        start += 1
    else:
        end += 1

print(answer)