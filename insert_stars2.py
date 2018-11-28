def insert_star_between_pairs(a_string):
    if not a_string or len(a_string) < 2:
        return a_string
    else:
        if a_string[0] == a_string[1]:
            return a_string[0] + '*' + insert_star_between_pairs(a_string[1:])
        else:
            return a_string[0] + insert_star_between_pairs(a_string[1:])


def main():
    pass

if __name__ == "__main__":
    main()

