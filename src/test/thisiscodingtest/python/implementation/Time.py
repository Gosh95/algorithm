N = int(input())

hour, minute, second = 0, 0, 0

answer = 0
while hour != N + 1:
    second += 1
    if second == 60:
        second = 0
        minute += 1
    if minute == 60:
        minute = 0
        hour += 1
    if "3" in str(hour) + str(minute) + str(second):
        answer += 1

print(answer)

