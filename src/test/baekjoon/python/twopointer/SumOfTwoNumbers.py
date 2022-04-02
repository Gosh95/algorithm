n = int(input())
nums = sorted(list(map(int, input().split())))
x = int(input())

left, right = 0, n - 1

answer = 0
while left < right:
    sum_of_num = nums[left] + nums[right]
    if sum_of_num == x:
        answer += 1
        left += 1
    elif sum_of_num > x:
        right -= 1
    else:
        left += 1

print(answer)