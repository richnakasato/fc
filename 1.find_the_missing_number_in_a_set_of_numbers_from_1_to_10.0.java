// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int findMissingNumber(int[] arr) {
    int[] perfect = {1,2,3,4,5,6,7,8,9,10};
    int perfect_sum = 0;
    for (int num : perfect) {
        perfect_sum += num;
    }
    int missing_sum = 0;
    for (int num : arr) {
        missing_sum += num;
    }
    return perfect_sum - missing_sum;
}
