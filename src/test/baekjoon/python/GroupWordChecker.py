N = int(input())
words = []
for i in range(N):
    words.append(input())
answer = N
for word in words:
    result = [False] * 26
    for i in range(len(word)):
        alphabet_idx = ord(word[i]) - ord('a')
        if result[alphabet_idx] and i > 0:
            if word[i] != word[i - 1]:
                answer -= 1
                break
            else:
                continue
        else:
            result[alphabet_idx] = True
print(answer)






