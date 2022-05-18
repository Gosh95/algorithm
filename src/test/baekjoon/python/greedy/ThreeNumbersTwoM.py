n = int(input())
numbers = sorted([int(input()) for _ in range(n)])
diff_of_num = 0

for i in range(1, n - 1):
    diff_of_num = max(diff_of_num, abs(-numbers[0] + (2 * numbers[i]) - numbers[i + 1]))
for i in range(0, n - 2):
    diff_of_num = max(diff_of_num, abs(numbers[n - 1] - (2 * numbers[i + 1]) + numbers[i]))

print(int(diff_of_num))
