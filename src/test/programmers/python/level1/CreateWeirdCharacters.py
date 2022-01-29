def solution(s):
    a = s.split(" ")
    for i in range(len(a)):
        char = list(a[i])
        for j in range(len(char)):
            if j % 2 == 0:
                char[j] = char[j].upper()
            else:
                char[j] = char[j].lower()
        a[i] = "".join(char)
    return " ".join(a)
