// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int[] selectionSortArray(int[] arr){
    if (arr.length < 2) return arr;
    int max = Integer.MAX_VALUE;
    for (int lhs = 0; lhs < arr.length; lhs++) {
        int min = lhs;
        for (int rhs = lhs+1; rhs < arr.length; rhs++) {
            if (arr[rhs] < arr[min]) min = rhs;
        }
        int temp = arr[min];
        arr[min] = arr[lhs];
        arr[lhs] = temp;
    }
    return arr;
}
