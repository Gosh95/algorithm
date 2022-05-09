heights = sorted([int(input()) for _ in range(9)])
over_height = sum(heights) - 100

start = 0
end = 8

while start <= end:
    sum_height = heights[start] + heights[end]

    if sum_height == over_height:
        heights.pop(end)
        heights.pop(start)
        break
    elif sum_height > over_height:
        end -= 1
    else:
        start += 1

for h in heights:
    print(h)