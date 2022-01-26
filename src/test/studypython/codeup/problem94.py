n = int(input())
nums = input().split()

for i in range(n):
    nums[i] = int(nums[i])

nums.sort()

print(nums[0])