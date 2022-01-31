def solution(s):
    english = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    for i in range(len(english)):
        s = s.replace(english[i], str(i))
    return int(s)

print(solution("one4seveneight"))
