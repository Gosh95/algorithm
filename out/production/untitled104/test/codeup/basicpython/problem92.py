n = int(input())
numbers = input().split()

students = []

for i in range(n):
    numbers[i] = int(numbers[i])

for i in range(23):
    students.append(0)

for i in numbers:
    students[i - 1] += 1

for i in students:
    print(i, end=' ')

