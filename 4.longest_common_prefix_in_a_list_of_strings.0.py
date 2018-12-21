def long_common_prefix(input_list):
    lengths = [len(item) for item in input_list]
    shortest_len = min(lengths)
    result = list()
    for i in range(shortest_len):
        if len(set([item[i] for item in input_list])) == 1:
            result.append(input_list[0][i])
        else:
            break
    return ''.join(result)


def main():
    pass


if __name__ == "__main__":
    main()

