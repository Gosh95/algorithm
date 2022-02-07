import sys
from collections import deque
N, K = map(int, sys.stdin.readline().split())
queue = deque([i for i in range(1, N + 1)])
print("<", end="")
for i in range(N - 1):
    count = 1
    while count != K:
        queue.append(queue.popleft())
        count += 1
    print(queue.popleft(), end=", ")
print(f"{queue.popleft()}>")

