from collections import deque

n = int(input())
arr = list(map(int, input().split()))
balloons = deque([[arr[i], i + 1] for i in range(n)])
pre_balloon, idx = balloons.popleft()
answer = [idx]


def roll(balloon):
    if balloon > 0:
        while balloon > 1:
            balloons.append(balloons.popleft())
            balloon -= 1

        return balloons.popleft()
    elif balloon < 0:
        while balloon < -1:
            balloons.appendleft(balloons.pop())
            balloon += 1

        return balloons.pop()


while balloons:
    pre_balloon, idx = roll(pre_balloon)

    answer.append(idx)

print(*answer)
