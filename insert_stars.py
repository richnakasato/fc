def insert_star_between_pairs(a_string):
    if a_string == None or len(a_string) < 2:
        return a_string
    else:
        mid = ''
        if a_string[0] == a_string[1]:
            mid = '*'
        return a_string[0] + mid + insert_star_between_pairs(a_string[1:])
