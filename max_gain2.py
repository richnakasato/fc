def max_gain(input_list):
    if not input_list or len(input_list) < 2:
        return 0
    min_so_far = input_list[0]
    max_ = 0
    for i in range(1, len(input_list)):
        curr = input_list[i] - min_so_far
        max_ = max(max_, curr)
        min_so_far = min(min_so_far, input_list[i])
    return max_


def main():
    pass

if __name__ == "__main__":
    main()

