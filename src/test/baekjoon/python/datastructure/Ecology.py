import sys

trees = {}

while True:
    tree = sys.stdin.readline().rstrip()

    if not tree:
        break

    if tree in trees:
        trees[tree] += 1
    else:
        trees[tree] = 1

keys = list(trees.keys())
total_count = sum(trees.values())
keys.sort()

for k in keys:
    print('%s %.4f' % (k, trees[k] / total_count * 100))
