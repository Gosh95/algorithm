def solution(numbers):
    return sum(0 if i in numbers else i for i in range(0, 10))

print(solution([1,2,3,4,6,7,8,0]))