def rotate_image(matrix):
    if matrix:
        n = len(matrix)
        top, bot, left, right = 0, n-1, 0, n-1
        while top < bot and left < right:
            count, times = 0, bot-top
            while count < times:
                temp = matrix[top][left]
                for i in range(times): # left
                    matrix[top+i][left] = matrix[top+i+1][left]
                for i in range(times): # bot
                    matrix[bot][left+i] = matrix[bot][left+i+1]
                for i in range(times): # right
                    matrix[bot-i][right] = matrix[bot-i-1][right]
                for i in range(times): # top
                    if right-i-1 == left:
                        matrix[top][right-i] = temp
                    else:
                        matrix[top][right-i] = matrix[top][right-i-1]
                count+=1
            top, left, bot, right = top+=1, left+=1, bot-=1, right-=1
    return matrix


def main():
    image_matrix1 = [[1]]
    image_matrix2 = [[1,2],
                     [3,4]]
    image_matrix3 = [[1,2,3],
                     [4,5,6],
                     [7,8,9]]
    image_matrix4 = [[1,2,3,4],
                     [5,6,7,8],
                     [9,10,11,12],
                     [13,14,15,16]]
    print(rotate_image(image_matrix4))


if __name__ == "__main__":
    main()

