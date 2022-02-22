from collections import deque

def solution(priorities, location):
    answer = 0
    queue = deque()
    for i in range(len(priorities)):
        queue.append([priorities[i], i])
    priorities.sort(reverse=True)
    turn = 1
    while queue:
        print(priorities)
        while queue[0][0] != max(priorities):
            queue.append(queue.popleft())
        if queue[0][0] == max(priorities):
            if queue[0][1] == location:
                answer = turn
                break
            else:
                queue.popleft()
                priorities.pop(0)
                turn += 1
    return answer



print(solution([1, 1, 9, 1, 1, 1], 0))