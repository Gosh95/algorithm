N = int(input())
nums = list(map(int, input().split()))
stack = []
result = [-1] * N
for i in range(N):
    while stack and nums[stack[-1]] < nums[i]:
        result[stack.pop()] = nums[i]
    stack.append(i)
print(*result)

# N = int(input())
# nums = list(map(int, input().split()))
# stack = []
# def binary_search(array, target, start, end):
#     while start <= end:
#         mid = (start + end) // 2
#         if array[mid] == target:
#             return mid
#         elif array[mid] > target:
#             end = mid - 1
#         elif array[mid] < target:
#             start = mid + 1
#     return None
#
# for i in range(N - 1):
#     target = nums[i]
#     stack.append(target)
#     temp = sorted(nums[i:])
#     idx = binary_search(temp, target, 0, len(temp) - 1)
#     if idx == len(temp) - 1:
#         print(-1, end=" ")
#     else:
#         print(temp[idx + 1], end=" ")
# print(-1, end=" ")
#





