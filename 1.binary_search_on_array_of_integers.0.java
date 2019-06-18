// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static Boolean binarySearch(int[] arr, int n) {
    if (arr.length == 0) return false;
    int lo = 0, hi = arr.length - 1;
    int mid;
    while (lo <= hi) {
        mid = lo + (hi - lo) / 2;
        if (arr[mid] == n) return true;
        else if (arr[mid] > n) hi = mid - 1;
        else lo = mid + 1;
    }
    return false;
}
