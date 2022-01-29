def solution(arr):
    a = []
    temp = 10
    for i in range(len(arr)):
        if temp != arr[i]:
            a.append(arr[i])
            temp = arr[i]
    return a

