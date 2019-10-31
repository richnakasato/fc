// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public static boolean helper(int[] arr, int idx, int currSum, int target) {
    System.out.println(idx);
    if (currSum == target) return true;
    if (idx == arr.length) return false;
    int val = arr[idx];
    idx += 1;
    currSum += val;
    if (helper(arr, idx, currSum, target)) return true;
    currSum -= val;
    if (helper(arr, idx, currSum, target)) return true;
    return false;
}

public static boolean groupSum(int[] arr, int target) {
    if (arr.length == 0) {
        if (target == 0) return true;
        else return false;
    }
    return helper(arr, 0, 0, target);
}
