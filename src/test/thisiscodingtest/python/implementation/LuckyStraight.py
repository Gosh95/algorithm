nums = list(map(int, input()))
idx = len(nums) // 2
left = sum(nums[0:idx])
right = sum(nums[idx:])
if left == right:
    print("LUCKY")
else:
    print("READY")
