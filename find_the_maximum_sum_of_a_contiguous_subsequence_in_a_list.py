import random

# omg kadane! -> definitely did NOT figure this one out!
def largestContinuousSum(arr):
    curr_max = glob_max = arr[0]
    for i in range(1, len(arr)):
        curr_max = max(arr[i], curr_max+arr[i])
        glob_max = max(glob_max, curr_max)
    return glob_max

def main():
    lo = -10
    hi = 10
    n = 10
    arr = [random.randint(lo, hi) for x in range(n)]
    print(arr)
    print(largestContinuousSum(arr))

if __name__ == "__main__":
    main()

