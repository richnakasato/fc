def duplicate_items(list_numbers):
    seen = set()
    dupe = set()
    for num in list_numbers:
        if num not in seen:
            seen.add(num)
        else:
            dupe.add(num)
    return list(dupe)
