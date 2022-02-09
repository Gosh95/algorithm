N = int(input())

def fibo(num):
    if num == 0:
        return 0
    if num == 1 or num == 2:
        return 1
    return fibo(num - 1) + fibo(num - 2)

print(fibo(N))
