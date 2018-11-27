def is_power_of_four(number):
    if number == 0:
        return False
    count = 0
    while number:
        if number & 1 == 0:
            count += 1
        else:
            if count % 2 or number >> 1 != 0:
                return False
        number = number >> 1
    return True


def main():
    pass

if __name__ == "__main__":
    main()

