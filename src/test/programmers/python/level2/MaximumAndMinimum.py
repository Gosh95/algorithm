def solution(s):
    arr_num = list(map(int, s.split()))
    return " ".join([str(min(arr_num)), str(max(arr_num))])

print(solution("-1 -1"))
