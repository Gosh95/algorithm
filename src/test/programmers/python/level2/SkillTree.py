def solution(skill, skill_trees):
    answer = 0
    for skill_tree in skill_trees:
        isOrdered = True
        for i in range(1, len(skill)):
            pre_idx = str(skill_tree).find(skill[i - 1])
            now_idx = str(skill_tree).find(skill[i])
            if now_idx != -1 and pre_idx == -1:
                isOrdered = False
                break
            if now_idx != -1 and pre_idx != -1:
                if now_idx <= pre_idx:
                    isOrdered = False
                    break
        if isOrdered:
            answer += 1

    return answer

print(solution("CBD", ["BACDE", "CBADF", "AECB", "BDA"]))