// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void transposeMatrix(int[][] matrix) {
    if (matrix.length == 0 || matrix[0].length == 0) {
        return;
    }
    int rows = matrix.length;
    int cols = matrix[0].length;
    for (int r=0; r<rows; r++) {
        for (int c=r+1; c<cols; c++) {
            int temp = matrix[r][c];
            matrix[r][c] = matrix[c][r];
            matrix[c][r] = temp;
        }
    }
    return;
}
