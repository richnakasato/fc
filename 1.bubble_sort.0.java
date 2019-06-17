// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int[] bubbleSortArray(int[] arr){
    if (arr.length < 2) return arr;
    boolean done = false;
    while (!done) {
        done = true;
        for (int i=1; i<arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
                done = false;
            }
        }
    }
    return arr;
}
