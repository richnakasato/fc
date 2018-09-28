def find_spiral(matrix):
    out = list()
    t, b, l, r = 0, len(matrix), 0, len(matrix[0])
    d = 0
    while t < b and l < r:
        if d % 4 == 0:
            for i in range(l, r):
                out.append(matrix[t][i])
            t += 1
        elif d % 4 == 1:
            for i in range(t, b):
                out.append(matrix[i][r-1])
            r -= 1
        elif d % 4 == 2:
            for i in range(r-1, l-1, -1):
                out.append(matrix[b-1][i])
            b -= 1
        else:
            for i in range(b-1, t-1, -1):
                out.append(matrix[i][l])
            l += 1
        d += 1
    return out
