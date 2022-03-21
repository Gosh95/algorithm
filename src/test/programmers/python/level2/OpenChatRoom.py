def solution(record):
    answer = []
    dic = dict()
    enter = "님이 들어왔습니다."
    leave = "님이 나갔습니다."
    for s in record:
        items = s.split(" ")
        if len(items) == 3:
            dic[items[1]] = items[2]
    for s in record:
        items = s.split(" ")
        if "Enter" in items:
            answer.append(dic[items[1]] + enter)
        elif "Leave" in items:
            answer.append(dic[items[1]] + leave)

    return answer