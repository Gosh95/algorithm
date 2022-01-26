data = int(input())

if data < 0:
    if data % 2 == 0:
        print('A')
    else:
        print('B')
elif data > 0:
    if data % 2 == 0:
        print('C')
    else:
        print('D')
