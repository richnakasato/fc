// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int[] merge(int[] arrLeft, int[] arrRight){
    int lhs = 0, rhs = 0, merge_idx = 0;
    int[] merged = new int[arrLeft.length + arrRight.length];
    while (lhs < arrLeft.length && rhs < arrRight.length) {
        if (arrLeft[lhs] < arrRight[rhs]) {
            merged[merge_idx] = arrLeft[lhs];
            lhs += 1;
        } else {
            merged[merge_idx] = arrRight[rhs];
            rhs += 1;
        }
        merge_idx += 1;
    }
    while (lhs < arrLeft.length) {
        merged[merge_idx] = arrLeft[lhs];
        lhs += 1;
        merge_idx += 1;
    }
    while (rhs < arrRight.length) {
        merged[merge_idx] = arrRight[rhs];
        rhs += 1;
        merge_idx += 1;
    }
    return merged;
}
