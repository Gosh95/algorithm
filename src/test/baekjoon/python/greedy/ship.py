N = int(input())
cranes = sorted(list(map(int, input().split())), reverse=True)
M = int(input())
boxes = sorted(list(map(int, input().split())), reverse=True)

if cranes[0] < boxes[0]:
    print(-1)
else:
    answer = 0
    while boxes:
        if not boxes:
            break
        for crane in cranes:
            for box in boxes:
                if crane >= box:
                    boxes.remove(box)
                    break
        answer += 1

    print(answer)