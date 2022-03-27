nums = sorted(list(map(int, input())))
while len(nums) >= 2:
    a = nums.pop(0)
    b = nums.pop(0)
    if a <= 1 or b <= 1:
        nums.append(a + b)
    else:
        nums.append(a * b)
print(nums[0])


