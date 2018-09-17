def find_range(input_list, input_number):
    r = Range(-1, -1)
    for idx num in enumerate(input_list):
        if num == input_number:
            if r.lower_bound == -1:
                r.lower_bound = idx
                r.upper_bound = idx
            else:
                r.upper_bound = idx
    return r
