N, X = map(int, input().split())
answer = 0
arr = []
for _ in range(N):
    A, B = map(int, input().split())
    answer += B
    arr.append([A, B, abs(A - B)])

arr.sort(key=lambda x: -x[2])
X -= (N * 1000)

for menu in arr:
    if menu[0] > menu[1]:
        X -= 4000
        if X < 0:
            break
        answer += -menu[1] + menu[0]

print(answer)
