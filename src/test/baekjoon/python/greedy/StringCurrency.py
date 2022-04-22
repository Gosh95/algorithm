N, X = map(int, input().split())

if (N * 26) < X or N > X:
    print('!')
else:
    answer = ['A'] * N
    X -= N
    idx = N - 1

    while X > 0:
        if X >= 25:  # 초기 A 세팅. A -> 다른 알파벳으로 바꾸는 비용 (알파벳 숫자 - 1)
            answer[idx] = 'Z'
            X -= 25
            idx -= 1
        else:
            answer[idx] = chr(X + 65)
            break

    print("".join(answer))
