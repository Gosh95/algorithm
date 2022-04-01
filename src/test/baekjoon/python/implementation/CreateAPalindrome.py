string = input()
rev_str = "".join(reversed(list(string)))

for i in range(len(string)):
    if string[i:] == rev_str[:len(rev_str) - i]:
        print(len(string) + i)
        break