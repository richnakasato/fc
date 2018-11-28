def flip_horizontal_axis(matrix):
    top = 0
    bottom = len(matrix)-1
    while top < bottom:
        for col in range(len(matrix[0])):
            matrix[top][col], matrix[bottom][col] = matrix[bottom][col], matrix[top][col]
        top += 1
        bottom -= 1
    print matrix
