def helper(arr, curr_idx, curr_jumps, jump_counts):
    if curr_idx < len(arr):
        if curr_idx == len(arr) - 1:
            jump_counts.append(curr_jumps)
        else:
            if arr[curr_idx]:
                for jump in range(1, arr[curr_idx]+1):
                    new_idx = curr_idx+jump
                    new_jumps = curr_jumps+1
                    helper(arr, new_idx, new_jumps, jump_counts)


def min_jumps(arr):
    result = None
    if arr:
        new_idx = 0
        new_jumps = 0
        jump_counts = list()
        helper(arr, new_idx, new_jumps, jump_counts)
        jump_counts.sort()
        print(jump_counts)
        result = jump_counts[0]
    return result


def main():
    arr = [2,5,7,8,9,12]
    assert min_jumps(arr)==2


if __name__ == "__main__":
    main()

