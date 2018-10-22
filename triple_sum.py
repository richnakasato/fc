'''
First attempt, but this is wrong, looks like I should have used a sliding window
'''

def double_sum(arr, target, skip_idx):
    memo = set()
    for idx, val in enumerate(arr):
        if idx != skip_idx:
            sub_target = target-val
            if sub_target not in memo:
                memo.add(val)
            else:
                return sub_target, val
    return None

def triple_sum(integer_list, target_number):
    output = list()
    for idx, val in enumerate(integer_list):
        sub_target = target_number-val
        results = double_sum(integer_list, sub_target, idx)
        if results:
            temp = list(results)
            temp.append(val)
            temp.sort()
            output.append(tuple(temp))
    return list(set(output))


def main():
    arr = [1,2,3,4,5,6,7]
    target = 10
    print(triple_sum(arr, target))

if __name__ == "__main__":
    main()

