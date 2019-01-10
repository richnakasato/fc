def double_sum(integer_list, target_number):
    left = 0
    right = len(integer_list) - 1
    results = list()
    while left < right:
        sum_ = integer_list[left] + integer_list[right]
        if sum_ < target_number:
            left += 1
        elif sum_ > target_number:
            right -= 1
        else:
            results.append([integer_list[left], integer_list[right]])
            left += 1
    return results

def triple_sum(integer_list, target_number):
    results = list()
    for idx in range(len(integer_list) - 2):
        sub_target = target_number - integer_list[idx]
        sub_results = double_sum(integer_list[idx+1:], sub_target)
        for sub_result in sub_results:
            temp = [integer_list[idx]] + sub_result[:]
            results.append(tuple(temp))
    return list(set(results))
