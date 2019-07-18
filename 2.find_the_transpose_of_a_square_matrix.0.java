// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void transposeMatrix(int[][] matrix) {
    if (matrix.length < 2) return;
    int count = matrix.length;
    for (int i=0; i<count; i++) {
        for (int j=i+1; j<count; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
    return;
}
