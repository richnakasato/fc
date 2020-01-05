// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public static boolean helper(int[] nums, int idx, int lhs, int rhs) {
    if (idx == nums.length) {
        return lhs == rhs;
    }
    int num = nums[idx];
    boolean left = helper(nums, idx + 1, lhs + num, rhs);
    boolean right = helper(nums, idx + 1, lhs, rhs + num);
    return left || right;
}

public static boolean splitArray(int[] arr) {
    if (arr.length == 0) return false;
    return helper(arr, 0, 0, 0);
}
