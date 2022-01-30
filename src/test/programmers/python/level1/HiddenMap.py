def solution(n, arr1, arr2):
    a = []
    for i in range(n):
        s = ''
        arr1[i] = format(int(arr1[i]), 'b').zfill(n)
        arr2[i] = format(int(arr2[i]), 'b').zfill(n)

        for j in range(len(arr1)):
            if arr1[i][j] == '1' or arr2[i][j] == '1':
                s += '#'
            else:
                s += ' '
        a.append(s)

    return a

# def solution2(n, arr1, arr2):
#     answer = []
#     for i,j in zip(arr1,arr2):
#         a12 = str(bin(i|j)[2:])
#         a12=a12.rjust(n,'0')
#         a12=a12.replace('1','#')
#         a12=a12.replace('0',' ')
#         answer.append(a12)
#     return answer
