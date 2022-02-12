def solution(A, B):
    arr_a, arr_b = sorted(A), sorted(B, reverse=True)
    return sum([a * b for a, b in zip(arr_a, arr_b)])

print(solution([1, 4, 2], [5, 4, 4]))