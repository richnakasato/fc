import random

def transpose_matrix(matrix):
    rows = len(matrix)
    cols = len(matrix[0])
    temp = 0
    print(rows)
    print(cols)
    for i in range(0, rows):
        for j in range(i+1, rows):
            print(i)
            print(j)
            matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]


def main():
    arr = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    print(arr)
    transpose_matrix(arr)
    print(arr)

if __name__ == "__main__":
    main()

