import random

def find_min_idx(arr):
    min_idx = 0
    for idx in range(1, len(arr)):
        if arr[idx] < arr[min_idx]:
            min_idx = idx
    return min_idx

def swap(arr, a, b):
    arr[a], arr[b] = arr[b], arr[a]

def selection_sort(a_list):
    if a_list > 1:
        sorted_tail = 0
        unsorted = a_list
        for idx in range(1, len(a_list)):
            min_idx = find_min_idx(unsorted)
            swap(a_list, sorted_tail, min_idx+sorted_tail)
            sorted_tail += 1
            unsorted = a_list[sorted_tail:]
    return a_list


def main():
    pass

if __name__ == "__main__":
    main()

