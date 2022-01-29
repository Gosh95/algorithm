def solution(arr, divisor):
    a = sorted([i for i in arr if i % divisor == 0])
    return a if len(a) != 0 else [-1]
