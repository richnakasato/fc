def largestContinuousSum(arr):
    g_max = l_max = arr[0]
    for num in arr[1:]:
        l_max = max(l_max+num, num)
        g_max = max(l_max, g_max)
    return g_max


def main():
    tests = [([31,-41,59,26,-53,58,97,-93,-23,84],187),
             ([-8,-2,-1,-9,-2,-4],-1),
             ([0,-2,-1,-3],0),
             ([1,2,3],6)]
    for test,result in tests:
        assert largestContinuousSum(test)==result


if __name__ == "__main__":
    main()

