// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void flipItVerticalAxis(int[][] matrix) {
    if (matrix.length == 0 || matrix[0].length == 0) return;
    for (int i = 0; i < matrix.length; i++) {
        int lhs = 0, rhs = matrix[0].length - 1;
        while (lhs < rhs) {
            int temp = matrix[i][lhs];
            matrix[i][lhs] = matrix[i][rhs];
            matrix[i][rhs] = temp;
            lhs++;
            rhs--;
        }
    }
    return;
}
