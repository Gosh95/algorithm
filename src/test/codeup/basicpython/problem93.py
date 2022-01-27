n = int(input())
nums = input().split()
arr = []

for i in range(n):
    arr.append(int(nums[i]))

for i in range(n-1, -1, -1):
    print(arr[i], end=' ')


