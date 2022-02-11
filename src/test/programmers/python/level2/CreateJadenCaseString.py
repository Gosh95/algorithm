def solution(s):
    result = ''
    isFirst = True
    for i in range(len(s)):
        if isFirst:
            result += s[i].upper()
            isFirst = False
        else:
            result += s[i].lower()

        if s[i] == " ":
            result += ""
            isFirst = True

    return result

# def solution(s):
#     item = s.split(" ")
#     result = []
#     for i in item:
#         result.append(i[0].upper() + i[1:].lower())
#     return " ".join(result)

print(solution("3people unFollowed me"))
print(solution("for the last week"))