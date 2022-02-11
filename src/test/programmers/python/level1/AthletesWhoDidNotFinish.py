def solution(participant, completion):
    dict_participant = {}
    for p in participant:
        dict_participant[p] = dict_participant.get(p, 0) + 1
    for c in completion:
        dict_participant[c] -= 1

    return "".join(i for i in dict_participant if dict_participant[i] != 0)

print(solution(["mislav", "stanko", "mislav", "ana"], ["stanko", "ana", "mislav"]))

# import collections
#
# def solution(participant, completion):
#     answer = collections.Counter(participant) - collections.Counter(completion)
#     return " ".join(list(answer.keys()))
#
# print(solution(["mislav", "stanko", "mislav", "ana"], ["stanko", "ana", "mislav"]))