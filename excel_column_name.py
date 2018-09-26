def excel_column_number_to_name(column_number):
    column_number -= 1
    alpha = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    output = list()
    while column_number > -1:
        output.append(alpha[column_number%26])
        column_number = (column_number / 26) - 1
    return ''.join(reversed(output))


def main():
    pass

if __name__ == "__main__":
    main()

