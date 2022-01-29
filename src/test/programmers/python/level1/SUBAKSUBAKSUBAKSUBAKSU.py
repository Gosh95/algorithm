def solution(n):
    s = "수박"
    return "".join([s[i % 2] for i in range(n)])

