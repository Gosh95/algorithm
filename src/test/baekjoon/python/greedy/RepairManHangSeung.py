N, L = map(int, input().split())
spot = sorted(list(map(int, input().split())))

answer = 0
tape = 0

for i in spot:
    if tape < i:
        tape = ((i + L) - 1)  # 양 끝 0.5 씩
        answer += 1

print(answer)