N = int(input())
arr = list(map(int, input().split()))
zero_arr = [0] * N

answer = 0

while zero_arr != arr:
    for i in range(N):
        if arr[i] % 2 == 1:
            arr[i] -= 1
            answer += 1

    if arr == zero_arr:
        break

    for j in range(N):
        arr[j] /= 2

    answer += 1

print(answer)
