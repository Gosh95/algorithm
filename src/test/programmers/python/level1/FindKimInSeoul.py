def solution(seoul):
    return "".join([f"김서방은 {i}에 있다" for i in range(len(seoul)) if seoul[i] == "Kim"])


