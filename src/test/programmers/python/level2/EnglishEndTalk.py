def solution(n, words):
    arr = [words[0]]
    idx = 0
    for i in range(1, len(words)):
        if words[i] in arr or words[i][0] != arr[-1][-1]:
            print(words[i])
            idx = i
            break
        arr.append(words[i])
    else:
        return [0, 0]
    first = (idx % n) + 1
    second = (idx // n) + 1

    return [first, second]

print(solution(2, ["hello", "one", "even", "never", "now", "world", "draw"]))