def solution(n):
    factors = []
    while n > 0:
        factors.append(n)
        n //= 2
    factors = sorted(factors)
    return sum([1 for i in factors if i % 2 != 0])

print(solution(7))