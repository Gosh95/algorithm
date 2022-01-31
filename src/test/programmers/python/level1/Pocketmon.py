def solution(nums):
    a = len(nums) // 2
    b = len(set(nums))

    return a if b > a else b
