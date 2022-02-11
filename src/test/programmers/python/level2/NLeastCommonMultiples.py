def gcd(a, b):
    a, b = min(a, b), max(a, b)
    if b % a == 0:
        return a
    while b % a != 0:
        temp = b % a
        b, a = a, temp
    return a

def solution(arr):
    answer = arr[0]
    for i in range(1, len(arr)):
        answer = (answer * arr[i]) // gcd(answer, arr[i])
    return answer

arr = [2,6,8,14]
print(solution(arr))
