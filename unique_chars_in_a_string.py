def unique_chars_in_string(input_string):
    memo = set()
    for char in input_string:
        if char not in memo:
            memo.add(char)
        else:
            return False
    return True
