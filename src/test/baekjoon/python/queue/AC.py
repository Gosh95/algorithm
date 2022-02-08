T = int(input())

for i in range(T):
    function = input()
    n = int(input())
    nums = input()[1:-1].split(",")

    rev, d_count = 0, function.count("D")
    if d_count > n:
        print("error")
        continue
    for j in list(function):
        if j == "R":
            rev += 1
            continue
        elif j == "D":
            if rev % 2 == 1:
                nums.pop(-1)
                d_count -= 1
            else:
                nums.pop(0)
                d_count -= 1

    if rev % 2 == 1:
        nums.reverse()
    if len(nums) != 0:
        print("[" + ",".join(nums) + "]")
    else:
        print("[]")
