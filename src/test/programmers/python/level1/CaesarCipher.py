def solution(s, n):
    answer = ""
    for i in s:
        char_code = ord(i)
        if i.isspace():
            answer += i
        elif i.islower():
            answer += chr((char_code - ord('a') + n) % 26 + ord('a'))
        elif i.isupper():
            answer += chr((char_code - ord('A') + n) % 26 + ord('A'))
    return answer

print(solution("a B z", 4))