document = input()
word = input()
word_len = len(word)

idx = 0
answer = 0
while idx != len(document):
    if word == document[idx : idx + word_len]:
        idx += word_len
        answer += 1
        continue
    idx += 1

print(answer)
