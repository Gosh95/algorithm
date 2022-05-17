N, M = map(int, input().split())
location = list(map(int, input().split()))

left = []
right = []
for p in location:
    if p > 0:
        right.append(p)
    else:
        left.append(abs(p))

left.sort(reverse=True)

distance = []

for i in range(len(left) // M):
    distance.append(left[i * M])
if len(left) % M > 0:
    distance.append(left[(len(left) // M) * M])

right.sort(reverse=True)

for i in range(len(right) // M):
    distance.append(right[i * M])
if len(right) % M > 0:
    distance.append(right[(len(right) // M) * M])

distance.sort()

answer = distance.pop()
answer += 2 * sum(distance)

print(answer)
