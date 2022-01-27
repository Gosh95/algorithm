num = int(input())
sum = 0
i = 1

while True:
    sum += i
    i += 1

    if sum >= num:
        print(sum)
        break