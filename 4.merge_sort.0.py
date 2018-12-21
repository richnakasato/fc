import random

def merge_sort_helper(arr_a, arr_b):
    arr_sorted = [None] * (len(arr_a) + len(arr_b))
    i = j = k = 0
    while i<len(arr_a) and j<len(arr_b):
        if arr_a[i] <= arr_b[j]:
            arr_sorted[k] = arr_a[i]
            i+=1
        else:
            arr_sorted[k] = arr_b[j]
            j+=1
        k+=1
    while i<len(arr_a):
        arr_sorted[k] = arr_a[i]
        i+=1
        k+=1
    while j<len(arr_b):
        arr_sorted[k] = arr_b[j]
        j+=1
        k+=1
    return arr_sorted

def merge_sort(a_list):
    if len(a_list) <= 1:
        return a_list
    else:
        mid = len(a_list)//2
        left = merge_sort(a_list[:mid])
        right = merge_sort(a_list[mid:])
        return merge_sort_helper(left, right)


def main():
    lo = 1
    hi = 100
    n = 20
    arr = [random.randint(lo, hi) for i in range(n)]
    assert merge_sort(arr) == sorted(arr), "lists are not sorted"

if __name__ == "__main__":
    main()

