N = int(input())
lt_zero = []
gt_zero = []
for i in range(N):
    num = int(input())
    if num <= 0:
        lt_zero.append(num)
    else:
        gt_zero.append(num)

lt_zero.sort()
gt_zero.sort(reverse=True)

answer = 0
if len(lt_zero) % 2 == 1:
    answer += lt_zero[-1]
    lt_zero.pop()

for i in range(0, len(lt_zero), 2):
    answer += (lt_zero[i] * lt_zero[i + 1])

if len(gt_zero) % 2 == 1:
    answer += gt_zero[-1]
    gt_zero.pop()

for i in range(len(gt_zero) - 1, -1, -2):
    if gt_zero[i] > 1 and gt_zero[i - 1] > 1:
        answer += (gt_zero[i] * gt_zero[i - 1])
    elif gt_zero[i] >= 1 or gt_zero[i - 1] >= 1:
        answer += (gt_zero[i] + gt_zero[i - 1])

print(answer)