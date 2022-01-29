def solution(numbers):
    a = set()
    for i in range(len(numbers) - 1):
        for j in range(i + 1, len(numbers)):
            a.add(numbers[i] + numbers[j])
    return sorted(list(a))


print(solution([5,0,2,7]))
