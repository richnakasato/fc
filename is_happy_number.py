def is_happy_number(number):
    seen = set()
    done = False
    res = False
    while not done:
        if number in seen:
            done = True
        else:
            seen.add(number)
        sum_ = 0
        while number:
            sum_ += (number%10)**2
            number //= 10
        if sum_ == 1:
            res = done = True
        else:
            number = sum_
    return res


def main():
    number = 28
    assert is_happy_number(number)

if __name__ == "__main__":
    main()

