def convert(n, k):
    converted = ''
    while n > 0:
        n, mod = divmod(n, k)
        converted += str(mod)
    return converted[::-1]

def is_prime(n):
    if n == 1:
        return False

    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def solution(n, k):
    prime_number = convert(n, k)
    nums = prime_number.split("0")
    answer = 0
    for i in nums:
        if i.isdigit():
            if is_prime(int(i)):
                answer += 1

    return answer

solution(437674, 3)