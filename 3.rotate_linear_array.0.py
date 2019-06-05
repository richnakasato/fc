def rotate_left(list_numbers, k):
    if not len(list_numbers):
        return list_numbers
    for times in range(k):
        temp = list_numbers[0]
        for idx in range(1, len(list_numbers)):
            list_numbers[idx - 1] = list_numbers[idx]
        list_numbers[len(list_numbers) - 1] = temp
    return list_numbers
