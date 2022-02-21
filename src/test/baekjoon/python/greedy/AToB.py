A, B = map(int, input().split())
answer = 0
while A != B:
    if str(B)[-1] == "1":
        B = int(str(B)[0:-1])
        answer += 1
    elif B % 2 == 0:
        B = B // 2
        answer += 1
    else:
        break
if A == B:
    print(answer + 1)
else:
    print(-1)
