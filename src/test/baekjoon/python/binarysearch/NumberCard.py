# N = int(input())
# nums = sorted(map(int, input().split()))
# M = int(input())
# cards = list(map(int, input().split()))
# result = [0] * M
# def binary_search(arr, target, start, end, idx):
#     while start <= end:
#         mid = (start + end) // 2
#         if arr[mid] == target:
#             result[idx] += 1
#             arr.pop(mid)
#             return binary_search(arr, target, start, len(arr) - 1, idx)
#         elif arr[mid] > target:
#             end = mid - 1
#         elif arr[mid] < target:
#             start = mid + 1
#     return None
#
# for i in range(len(cards)):
#     binary_search(nums, cards[i], 0, len(nums) - 1, i)
#
# print(*result)
#
N = int(input())
n_cards = list(map(int, input().split()))
M = int(input())
m_cards = list(map(int, input().split()))
dictionary = {}

for i in n_cards:
    dictionary[i] = dictionary.get(i, 0) + 1

for i in m_cards:
    if i in dictionary:
        print(dictionary[i], end=" ")
    else:
        print(0, end=" ")

