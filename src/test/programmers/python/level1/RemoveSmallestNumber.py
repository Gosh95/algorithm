def solution(arr):
    arr.remove(min(list(arr)))
    return arr if len(arr) != 0 else [-1]

