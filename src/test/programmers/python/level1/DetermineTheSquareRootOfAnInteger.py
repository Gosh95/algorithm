from math import sqrt

def solution(n):
    temp = sqrt(n)
    return int(pow(temp + 1, 2)) if temp == int(temp) else -1

