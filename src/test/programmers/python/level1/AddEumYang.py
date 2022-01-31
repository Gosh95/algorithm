# def solution(absolutes, signs):
#     for i in range(len(signs)):
#         if signs[i] == False:
#             absolutes[i] *= -1
#     return sum(absolutes)

def solution(absolutes, signs):
    return sum([absolute if sign else -absolute for absolute, sign in zip(absolutes, signs)])