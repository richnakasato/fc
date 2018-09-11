import random

# returns string - binary representation of number
def dec_to_bin(number):
    outstring = ''
    while number:
        rem = number//2
        bit = number%2
        if bit == 0:
            outstring = '0' + outstring
        else:
            outstring = '1' + outstring
        number = rem
    return '0' if outstring == '' else outstring

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

