def duplicate_items(list_numbers):
    memo = dict()
    for item in list_numbers:
        if item not in memo:
            memo[item] = 1
        else:
            memo[item] += 1
    dupe = list()
    for k, v in memo.items():
        if v > 1:
            dupe.append(k)
    return dupe

