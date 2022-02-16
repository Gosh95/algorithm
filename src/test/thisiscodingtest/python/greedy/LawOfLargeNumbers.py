N, M, K = map(int, input().split())
nums = sorted(list(map(int, input().split())))


count = (M // (K + 1)) * K
count += (M % (K + 1))

num_a = nums[-1] * count
num_b = nums[-2] * (M - count)

print(num_a + num_b)

