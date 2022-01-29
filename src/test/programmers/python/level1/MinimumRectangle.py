def solution(sizes):
    w = 0
    h = 0
    for i in range(len(sizes)):
        for j in range(2):
            temp_w = sizes[i][0]
            temp_h = sizes[i][1]

            sizes[i][0], sizes[i][1] = max(temp_w, temp_h), min(temp_w, temp_h)
        w = max(w, sizes[i][0])
        h = max(h, sizes[i][1])
    return w * h

