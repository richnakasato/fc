// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int[] selectionSortArray(int[] arr) {
    if (arr.length < 2) return arr;
    for (int i=0; i<arr.length-1; i++) {
        int smallest = i;
        for (int j=i+1; j<arr.length; j++) {
            if (arr[j] < arr[smallest]) {
                smallest = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[smallest];
        arr[smallest] = temp;
    }
    return arr;
}
