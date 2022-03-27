N, K = map(int, input().split())
answer = 0
while bin(N).count("1") > K:
    N += 1
    answer += 1
    print(N, answer)
print(answer)