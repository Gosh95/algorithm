N = int(input())

town_info = []
people_cnt = 0

for i in range(N):
    town, people = map(int, input().split())
    town_info.append([town, people])
    people_cnt += people

town_info.sort(key=lambda x: x[0])

if people_cnt % 2 == 1:
    people_cnt += 1

half_cnt = people_cnt // 2

answer = 0
temp_cnt = 0
for t in town_info:
    temp_cnt += t[1]
    if temp_cnt >= half_cnt:
        answer = t[0]
        break
print(answer)
