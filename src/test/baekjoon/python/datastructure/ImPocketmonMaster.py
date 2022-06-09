n, m = map(int, input().split())
dictionary = {}
answer = []

for i in range(1, n + 1):
    name = input()

    dictionary[i] = name
    dictionary[name] = i

for _ in range(m):
    question = input()
    answer.append(dictionary[int(question)] if question.isdigit() else dictionary[question])

for a in answer:
    print(a)
