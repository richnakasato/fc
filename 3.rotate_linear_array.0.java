// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public static int nextIdx(int[] arr, int k, int currIdx) {
    return (currIdx + arr.length - k) % arr.length;
}

public static int[] rotateLeft(int[] arr, int k) {
    if (arr.length < 2 || k < 1) return arr;
    if (k > arr.length) k = k - arr.length;
    int currIdx = 0;
    int currVal = arr[currIdx];
    int counter = 0;
    while (counter < arr.length) {
        int nextIdx = nextIdx(arr, k, currIdx);
        int nextVal = arr[nextIdx];
        arr[nextIdx] = currVal;
        currIdx = nextIdx;
        currVal = nextVal;
        counter += 1;
    }
    return arr;
}
