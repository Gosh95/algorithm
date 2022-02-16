N, K = map(int, input().split())

result = 0
minus = 0
while N > 1:
    if N % K != 0:
        minus = N % K
        result += minus
        N -= minus
    else:
        N = int(N / K)
        result += 1

print(result)