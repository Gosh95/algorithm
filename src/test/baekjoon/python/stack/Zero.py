K = int(input())
nums = []
for i in range(K):
    num = int(input())
    if num == 0 and len(nums) != 0:
        nums.pop()
        continue
    nums.append(num)
print(sum(nums))



