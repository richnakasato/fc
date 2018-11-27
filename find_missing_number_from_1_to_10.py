import random

def find_missing_number(list_numbers):
    # can also do n(n-1)/2
    return sum([x for x in range(1, len(list_numbers)+2)]) - sum(list_numbers)


def main():
    arr = [random.randint(2, 30) for x in range(10)]
    for item in arr:
        list_numbers = range(1, item)
        missing = list_numbers.pop(random.randrange(len(list_numbers)))
        result = find_missing_number(list_numbers)
        print(list_numbers)
        print(missing)
        print(result)
        if find_missing_number(list_numbers) == missing:
            print('correct')
        else:
            print('incorrect')


if __name__ == "__main__":
    main()

