from collections import *
import sys
K = int(sys.stdin.readline())
for i in range(K):
    N, M = map(int, sys.stdin.readline().split())
    index = deque([i for i in range(N)])
    priority = deque(list(map(int, sys.stdin.readline().split())))
    rank = 1
    if N == 1:
        print(1)
        continue
    while True:
        if priority[0] != max(priority):
            priority.append(priority.popleft())
            index.append(index.popleft())
        else:
            if index[0] != M:
                rank += 1
                priority.popleft()
                index.popleft()
                continue
            else:
                print(rank)
                break
