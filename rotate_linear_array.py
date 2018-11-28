def rotate_left(list_numbers, k):
    n = len(list_numbers)
    shift = n-k
    res = [None] * n
    for idx, num in enumerate(list_numbers):
        res[(idx+shift)%n] = list_numbers[idx]
    return res

def rotate_left2(list_numbers, k):
    n = len(list_numbers)
    count = 0
    dst = 0
    src = (dst+k)%n
    temp = list_numbers[dst]
    while count < n:
        if src == 0:
            list_numbers[dst] = temp
        else:
            list_numbers[dst] = list_numbers[src]
        dst = src
        src = (dst+k)%n
        count += 1
    return list_numbers

def main():
    arr = [1,2,3,4,5]
    k = 2
    print(arr)
    print(rotate_left2(arr, k))

if __name__ == "__main__":
    main()

