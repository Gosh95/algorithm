num = str(input())

for i in range(1, int(num) + 1):
    if str(i).find('3') != -1 or str(i).find('6') != -1 or str(i).find('9') != -1:
        print("X", end=' ')
    else:
        print(i, end=' ')

