# Necessary modules have already been imported.
def excel_column_number_to_name(column_number):
    alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    res = list()
    while column_number:
        idx = (column_number-1)%26
        res = [alpha[idx]] + res[:]
        column_number = (column_number-1)//26
    return ''.join(res)


def main():
    pass

if __name__ == "__main__":
    main()

