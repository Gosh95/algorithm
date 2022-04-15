N = int(input())
notes = list(map(int, input().split()))
arr = [0] * N

answer = 0
for i in range(N):
    if arr[i] != notes[i]:
        answer += 1
        for j in range(i, i + 3):
            if j > N - 1:
                break
            arr[j] = 1 - arr[j]

print(answer)