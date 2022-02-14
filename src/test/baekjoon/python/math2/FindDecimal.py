M, N = map(int, input().split())
def prime(m, n):
    n += 1
    isPrime = [True] * n
    for i in range(2, int(n ** 0.5) + 1):
        if isPrime[i]:
            for j in range(i * 2, n, i):
                isPrime[j] = False

    for j in range(m, n):
        if j > 1 and isPrime[j]:
            print(j)

prime(M, N)



