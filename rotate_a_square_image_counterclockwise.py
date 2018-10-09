def rotate_square_image_ccw(matrix):
    for i in range(len(matrix)):
        for j in range(i, len(matrix[0])):
            matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
    top = 0
    bot = len(matrix) - 1
    for i in range(len(matrix[0])):
        matrix[top][i], matrix[bot][i] = matrix[bot][i], matrix[top][i]
    return matrix
