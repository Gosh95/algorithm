# 단순한 접근
# def solution(prices):
#     answer = [0] * len(prices)
#     for i in range(len(prices)):
#         for j in range(i + 1, len(prices)):
#             answer[i] += 1
#             if prices[i] > prices[j]:
#                 break
#     return answer

# 큐
# from collections import *
# def solution(prices):
#     queue = deque(prices)
#     answer = []
#     while queue:
#         price = queue.popleft()
#         sec = 0
#         for s in queue:
#             sec += 1
#             if price > s:
#                 break
#         answer.append(sec)
#     return answer

# 스택
def solution(prices):
    stack = []
    answer = [i for i in range(len(prices) - 1, -1, -1)]
    for i in range(len(prices)):
        while stack and prices[stack[-1]] > prices[i]:
            sec = i - stack[-1]
            answer[stack.pop()] = sec
        stack.append(i)
    return answer
print(solution([1, 2, 3, 2, 3]))

