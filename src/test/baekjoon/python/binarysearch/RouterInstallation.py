N, C = map(int, input().split())
homes = []
for i in range(N):
    homes.append(int(input()))
homes.sort()
start = 1  # 최소 거리
end = homes[-1] - homes[0]  # 최대 거리

def binary_search(arr, start, end):
    while start <= end:
        count = 1  # 첫 번째 집은 이미 설치되어있다고 가정
        last_locate = homes[0]
        mid = (start + end) // 2
        for x in arr:
            if last_locate + mid <= x:
                last_locate = x
                count += 1
        if count >= C:
            start = mid + 1
        else:
            end = mid - 1
    return end

print(binary_search(homes, start, end))