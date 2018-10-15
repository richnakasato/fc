import random

# returns string - binary representation of number
def dec_to_bin(number):
    if number < 2:
        return str(number)
    bits = ''
    while number:
        bits = str(number%2) + bits
        number//=2
    return bits

def dec_to_bin_recurse(number):
    if number == 0:
        return ''
    else:
        return str(dec_to_bin_recurse(number//2)) + str(number%2)


def main():
    arr = [random.randint(0, 15) for x in range(10)]
    print(arr)

    for num in arr:
        print(dec_to_bin(num))
        print(dec_to_bin_recurse(num))
        print('--')

if __name__ == "__main__":
    main()

