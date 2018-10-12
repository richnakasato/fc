def excel_column_name_to_number(column_title):
    val = 0
    bit = 0
    for idx in range(len(column_title)-1, -1, -1):
        val += pow(26, bit) * (ord(column_title[idx]) - ord('A') + 1)
        bit += 1
    return val
