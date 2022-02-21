N = int(input())
card1 = list(map(int, input().split()))
M = int(input())
card2 = list(map(int, input().split()))

card1.sort()

def binary_search(arr, start, end, target):
    while start <= end:
        mid = (start + end) // 2
        if arr[mid] == target:
            return True
        elif arr[mid] > target:
            end = mid - 1
        elif arr[mid] < target:
            start = mid + 1
    return False

answer = [0] * len(card2)
start = 0
end = len(card1) - 1
for i in range(len(card2)):
    if binary_search(card1, start, end, card2[i]):
        answer[i] = 1

print(*answer)


