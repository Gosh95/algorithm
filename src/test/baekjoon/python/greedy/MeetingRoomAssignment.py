N = int(input())
time = []
for i in range(N):
    time.append(list(map(int, input().split())))

time = sorted(time, key=lambda x: (x[1], x[0]))

last_time = time[0][1]
count = 1
for i in range(1, N):
    if last_time <= time[i][0]:
        last_time = time[i][1]
        count += 1
print(count)

