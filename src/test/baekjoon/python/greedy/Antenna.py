N = int(input())
position = list(map(int, input().split()))
position.sort()
print(position[(N - 1) // 2])