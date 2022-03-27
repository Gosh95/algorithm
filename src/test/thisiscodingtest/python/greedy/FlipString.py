num = input()
one = num.split("0")
to_zero = 0
for i in one:
    if "1" in i:
        to_zero += 1

zero = num.split("1")
to_one = 0
for i in zero:
    if "0" in i:
        to_one += 1
print(min(to_zero, to_one))