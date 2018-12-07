def rotate_square_image_ccw(matrix):
    # transpose
    for i in range(len(matrix)):
        for j in range(i, len(matrix[0])):
            matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
    # horizontal axis flip
    top = 0
    bot = len(matrix)-1
    while top < bot:
        for i in range(len(matrix[0])):
            matrix[top][i], matrix[bot][i] = matrix[bot][i], matrix[top][i]
        top += 1
        bot -= 1


def main():
    pass

if __name__ == "__main__":
    main()

