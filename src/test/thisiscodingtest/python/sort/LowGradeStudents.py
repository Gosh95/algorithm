N = int(input())

arr = []

for i in range(N):
    arr.append(tuple(input().split()))

def setting(data):
    return data[1]

arr = sorted(arr, key=setting)

for i in range(len(arr)):
    print(arr[i][0], end=" ")

