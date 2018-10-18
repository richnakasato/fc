def rotate_image(image_matrix):
    n = len(image_matrix)
    out_matrix = [[None for c in range(n)] for r in range(n)]
    for r in range(n):
        for c in range(n):
            out_matrix[c][n-r-1] = image_matrix[r][c]
    return out_matrix
