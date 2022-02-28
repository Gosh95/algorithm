L, R = input().split()
answer = 0
if len(L) != len(R):
    answer = 0
else:
    for i in range(len(L)):
        if L[i] == '8' and R[i] == '8':
            answer += 1
        elif L[i] != R[i]:
            break
print(answer)
