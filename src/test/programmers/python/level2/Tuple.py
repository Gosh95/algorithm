def solution(s):
    answer = []
    str_list = s.replace("{", "").replace("}}", "").split("},")
    str_list.sort(key=len)
    for s in str_list:
        temp = s.split(",")
        for i in temp:
            if not int(i) in answer:
                answer.append(int(i))

    return answer

print(solution("{{123}}"))