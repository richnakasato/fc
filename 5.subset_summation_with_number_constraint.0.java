 // java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public static int findNum(int[] arr, int must_have) {
    for (int i=0; i<arr.length; i++) {
        if (arr[i] == must_have) return i;
    }
    return -1;
}

public static boolean findSum(int[] arr, int idx, int curr, int target) {
    if (idx == arr.length) {
        return curr == target;
    }
    int num = arr[idx];
    boolean with = findSum(arr, idx + 1, curr + num, target);
    boolean without = findSum(arr, idx + 1, curr, target);
    return with || without;
}

public static boolean groupSumWithNum(int[] arr, int must_have, int target) {
    int exclude = findNum(arr, must_have);
    boolean foundSum = false;
    if (exclude != -1) {
        int[] excluded_arr = new int[arr.length - 1];
        int src = 0;
        int dest = 0;
        while (src < arr.length) {
            if (src != exclude) {
                excluded_arr[dest] = arr[src];
                dest++;
            }
            src++;
        }
        foundSum = findSum(excluded_arr, 0, 0, target - must_have);
    } else {
        foundSum = findSum(arr, 0, 0, target);
    }
    return foundSum;
}
