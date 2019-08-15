// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void transposeSquareImageCW(int[][] matrix) {
    int r = matrix.length;
    int c = matrix[0].length;
    for (int i=0; i<r; ++i) {
        for (int j=i+1; j<c; ++j) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
}

public static void verticalFlipSquareImageCW(int[][] matrix) {
    for (int i=0; i<matrix.length; ++i) {
        int left = 0;
        int right = matrix[0].length - 1;
        while (left < right) {
            int temp = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = temp;
            left += 1;
            right -= 1;
        }
    }
}

public static void rotateSquareImageCW(int[][] matrix) {
    if (matrix.length == 0 || matrix[0].length == 0) return;
    transposeSquareImageCW(matrix);
    verticalFlipSquareImageCW(matrix);
}
