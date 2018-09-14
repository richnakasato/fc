def flip_vertical_axis(matrix):
    #TODO: error handling
    for row in matrix:
        left = 0
        right = len(matrix[0]) - 1
        while left < right:
            row[left], row[right] = row[right], row[left]
            left += 1
            right -= 1
