nums = input().split("-")
result = 0
result += sum(map(int, nums[0].split("+")))
for i in range(1, len(nums)):
    _sum = sum(map(int, nums[i].split("+")))
    result -= _sum
print(result)