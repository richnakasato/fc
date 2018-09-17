import random

def bubble_sort(arr):
    done = False
    while not done:
        done = True
        for i in range(len(arr)-1):
            if arr[i] > arr[i+1]:
                arr[i], arr[i+1] = arr[i+1], arr[i]
                done = False
    return arr


def main():
    arr = [random.randint(0, 100) for x in range(20)]
    print(bubble_sort(arr))

if __name__ == "__main__":
    main()

