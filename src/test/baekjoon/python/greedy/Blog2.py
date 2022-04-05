N = int(input())
colors = input()
color_dic = {"B": 0, "R": 0}
temp_color = ''
for c in colors:
    if c != temp_color:
        color_dic[c] += 1
    temp_color = c
print(min(color_dic["B"], color_dic["R"]) + 1)