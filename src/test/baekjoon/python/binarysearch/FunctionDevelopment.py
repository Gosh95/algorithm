def solution(progresses, speeds):
    answer = []
    time, count = 0, 0
    while progresses:
        if progresses[0] + time * speeds[0] >= 100:
            count += 1
            progresses.pop(0)
            speeds.pop(0)
        else:
            if count != 0:
                answer.append(count)
                count = 0
            time += 1
    answer.append(count)
    return answer

print(solution([93, 30, 55], [1, 30, 5]))

