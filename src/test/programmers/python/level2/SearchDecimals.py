def solution(numbers):
    max_range = int("".join(sorted(list(numbers), reverse=True)))
    isDecimal = [True] * (max_range + 1)
    for i in range(2, int((max_range + 1) ** 0.5) + 1):
        if isDecimal[i]:
            for j in range(i * 2, max_range + 1, i):
                isDecimal[j] = False

    answer = 0
    for i in range(2, max_range + 1):
        if isDecimal[i]:
            right = True
            i, nums = str(i), list(numbers)
            for j in range(len(i)):
                if i[j] in nums:
                    nums.remove(i[j])
                else:
                    right = False
                    break
            if right:
                answer += 1

    return answer

print(solution("011"))
