from collections import *
N, M = map(int, input().split())
nums = deque([i for i in range(1, N + 1)])
pick_nums = list(map(int, input().split()))
count = 0
for pick_num in pick_nums:
    if nums[0] == pick_num:
        nums.popleft()
        continue
    index, half_index = nums.index(pick_num), 0

    if len(nums) % 2 == 0:
        half_index = len(nums) // 2 - 1
    else:
        half_index = len(nums) // 2

    if index > half_index:
        while nums[0] != pick_num:
            nums.appendleft(nums.pop())
            count += 1
    else:
        while nums[0] != pick_num:
            nums.append(nums.popleft())
            count += 1
    nums.popleft()
print(count)



