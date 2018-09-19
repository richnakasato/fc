def merge_ranges(input_range_list):
    out_list = list()
    if len(input_range_list) > 0:
        curr_range = Range(input_range_list[0].lower_bound, input_range_list[0].upper_bound)
        for i in range(1, len(input_range_list)):
            next_range = input_range_list[i]
            if curr_range.upper_bound < next_range.lower_bound:
                out_list.append(curr_range)
                curr_range = Range(next_range.lower_bound, -1)
                #curr_range.lower_bound = next_range.lower_bound
            curr_range.upper_bound = next_range.upper_bound
        out_list.append(curr_range)
    return out_list
