word = sorted(list(input()), key=lambda x: ord(x))
num = 0
while str(word[0]).isnumeric():
    num += int(word.pop(0))
print("".join(word) + str(num))
