def insert_and_merge(input_range_list, new_range):
    input_range_list.append(new_range)
    input_range_list.sort(key=lambda x: x.lower_bound)
    temp = input_range_list[0]
    result = list()
    for range_ in input_range_list[1:]:
        if temp.upper_bound >= range_.lower_bound:
            upper = max(temp.upper_bound, range_.upper_bound)
            temp.upper_bound = upper
        else:
            result.append(temp)
            temp = Range(range_.lower_bound, range_.upper_bound)
    result.append(temp)
    return result


def main():
    pass

if __name__ == "__main__":
    main()

