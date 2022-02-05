N, title, count = int(input()), 666, 1
while not count == N:
    title += 1
    if str(title).__contains__("666"):
        count += 1
print(title)
