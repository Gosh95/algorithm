N = int(input())
solutions = sorted(list(map(int, input().split())))

answer = 9999999999999
results = [0] * 2
def binary_search(arr, start, end, answer):
    while start < end:
        total = arr[start] + arr[end]
        if answer > abs(total):
            answer = abs(total)
            results[0] = arr[start]
            results[1] = arr[end]
            if answer == 0:
                break

        if total < 0:
            start += 1
        else:
            end -= 1
binary_search(solutions, 0, N - 1, answer)
print(*results)
