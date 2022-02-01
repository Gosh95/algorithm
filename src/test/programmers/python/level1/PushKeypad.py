def solution(numbers, hand):
    keypad = {
        1: [0, 0],
        2: [0, 1],
        3: [0, 2],
        4: [1, 0],
        5: [1, 1],
        6: [1, 2],
        7: [2, 0],
        8: [2, 1],
        9: [2, 2],
        '*': [3, 0],
        0: [3, 1],
        '#': [3, 2],
    }
    result = []
    left, right = keypad['*'], keypad['#']
    for num in numbers:
        if num == 3 or num == 6 or num == 9:
            right = keypad[num]
            result.append("R")
        elif num == 1 or num == 4 or num == 7:
            left = keypad[num]
            result.append("L")

        if num == 8 or num == 5 or num == 2 or num == 0:
            num_x, num_y = keypad[num][0], keypad[num][1]
            left_distance = (abs(num_x - left[0]) + abs(num_y - left[1]))
            right_distance = (abs(num_x - right[0]) + abs(num_y - right[1]))
            if right_distance > left_distance:
                left = keypad[num]
                result.append("L")
            elif right_distance < left_distance:
                right = keypad[num]
                result.append("R")
            else:
                if hand == "left":
                    left = keypad[num]
                    result.append("L")
                else:
                    right = keypad[num]
                    result.append("R")

    return "".join(result)

print(solution([1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5], "right"))