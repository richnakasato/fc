import random

def max_gain(input_list):
    max_gain = 0
    if input_list == None or len(input_list) < 2:
        return max_gain
    curr_lo = input_list[0]
    for i in range(1, len(input_list)):
        curr_diff = input_list[i] - curr_lo
        if curr_diff > max_gain:
            max_gain = curr_diff
        if curr_lo > input_list[i]:
            curr_lo = input_list[i]
    return max_gain


def main():
    arr = [random.randint(0, 20) for x in range(10)]
    print(arr)
    print(max_gain(arr))

if __name__ == "__main__":
    main()

