def solution(arr1, arr2):
    answer = []
    for i in range(len(arr1)):
        result = []
        for j in range(len(arr2[0])):
            _sum = 0
            for k in range(len(arr1[i])):
                num_a = arr1[i][k]
                num_b = arr2[k][j]
                _sum += num_a * num_b
            result.append(_sum)
        answer.append(result)

    return answer

print(solution([[2, 3, 2], [4, 2, 4], [3, 1, 4]],[[5, 4, 3], [2, 4, 1], [3, 1, 1]]))