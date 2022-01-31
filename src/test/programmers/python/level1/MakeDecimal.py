def solution(nums):
    answer = 0
    for i in range(len(nums) - 2):
        for j in range(i + 1, len(nums) - 1):
            for k in range(j + 1, len(nums)):
                num = nums[i] + nums[j] + nums[k]
                n = 0
                for p in range(1, num + 1):
                    if num % p == 0:
                        n += 1
                if n == 2:
                    answer += 1
    return answer


# print(solution([1,2,7,6,4]))