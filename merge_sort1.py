def merge(a, b):
    arr = [None for _ in range(len(a)+len(b))]
    i = j = k = 0
    while i < len(a) and j < len(b):
        if a[i] < b[j]:
            arr[k] = a[i]
            i += 1
        else:
            arr[k] = b[j]
            j += 1
        k += 1
    while i < len(a):
        arr[k] = a[i]
        i += 1
        k += 1
    while j < len(b):
        arr[k] = b[j]
        j += 1
        k += 1
    return arr

def merge_sort(a_list):
    if len(a_list) < 2:
        return a_list
    else:
        mid = len(a_list)//2
        left = merge_sort(a_list[:mid])
        right = merge_sort(a_list[mid:])
        merged = merge(left, right)
        return merged

def main():
    pass

if __name__ == "__main__":
    main()

