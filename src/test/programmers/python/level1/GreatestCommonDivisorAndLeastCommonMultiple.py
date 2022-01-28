def solution(n, m):
    answer = []
    a, b = min(n, m), max(n, m)
    answer.append(gcd(a, b))
    answer.append(int(a * b / gcd(a, b)))
    return answer

def gcd(n, m):
    while True:
        if m % n == 0:
            return n
            break
        else:
            temp = m % n
            m = n
            n = temp
