def rotate_left(list_numbers, k):
    n = len(list_numbers)
    shift = n-k
    res = [None] * n
    for idx, num in enumerate(list_numbers):
        res[(idx+shift)%n] = list_numbers[idx]
    return res


def main():
    pass

if __name__ == "__main__"
    main()
