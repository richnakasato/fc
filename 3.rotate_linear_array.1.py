def rotate_left(list_numbers, k):
    if len(list_numbers) < 2:
        return list_numbers
    src_idx = 0
    src_tmp = list_numbers[src_idx]
    dst_idx = None
    dst_tmp = None
    size = len(list_numbers)
    delta = size - k
    for i in range(size):
        dst_idx = (src_idx + delta) % size
        dst_tmp = list_numbers[dst_idx]
        list_numbers[dst_idx] = src_tmp
        src_idx = dst_idx
        src_tmp = dst_tmp
    return list_numbers
