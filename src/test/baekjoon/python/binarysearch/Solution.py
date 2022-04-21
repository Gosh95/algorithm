import sys

N = int(input())
solutions = list(map(int, input().split()))

left = 0
right = N - 1
max_value = sys.maxsize
answer = []
while left < right:
    solution_sum = solutions[left] + solutions[right]

    if abs(solution_sum) <= max_value:
        max_value = abs(solution_sum)
        answer = [solutions[left], solutions[right]]

    if solution_sum > 0:
        right -= 1
    elif solution_sum < 0:
        left += 1
    else:
        break

print(*answer)