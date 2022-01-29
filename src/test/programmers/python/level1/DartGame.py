def solution(dartResult):
    temp = ''
    score = []
    for i in list(dartResult):
        i = str(i)
        if i.isnumeric():
            temp += i
        elif i == "S":
            temp = pow(int(temp), 1)
            score.append(temp)
            temp = ''
        elif i == "D":
            temp = pow(int(temp), 2)
            score.append(temp)
            temp = ''
        elif i == "T":
            temp = pow(int(temp), 3)
            score.append(temp)
            temp = ''
        elif i == "*":
            if len(score) == 1:
                score[0] *= 2
            else:
                idx = len(score)
                score[idx - 2], score[idx - 1] = score[idx - 2] * 2, score[idx - 1] * 2
        elif i == "#":
            score[-1] *= -1

    return sum(score)

