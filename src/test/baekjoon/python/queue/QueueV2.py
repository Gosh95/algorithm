from collections import deque
import sys

N = int(input())
queue = deque()
for i in range(N):
    command = list(sys.stdin.readline().split())
    size = len(queue)
    if command[0].__contains__("push"):
        queue.append(int(command[1]))
    elif command[0] == "pop":
        if queue:
            print(queue.popleft())
        else:
            print(-1)
    elif command[0] == "size":
        print(size)
    elif command[0] == "empty":
        print(0) if size != 0 else print(1)
    elif command[0] == "front":
        print(queue[0]) if queue else print(-1)
    elif command[0] == "back":
        print(queue[-1]) if queue else print(-1)

