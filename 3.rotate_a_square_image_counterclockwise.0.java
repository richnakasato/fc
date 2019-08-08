// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void transposeSquareImage(int[][] matrix) {
    int r=matrix.length,c=matrix[0].length;
    for (int i=0; i<r; i++) {
        for (int j=i+1; j<c; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
}

public static void flipHorizontalSquareImage(int[][] matrix) {
    int cols=matrix[0].length;
    int top=0,bot=matrix.length-1;
    while (top < bot) {
        for (int i=0; i<cols; i++) {
            int temp = matrix[top][i];
            matrix[top][i] = matrix[bot][i];
            matrix[bot][i] = temp;
        }
        top += 1;
        bot -= 1;
    }
}

public static void rotateSquareImageCCW(int[][] matrix) {
    if (matrix.length == 0 || matrix[0].length == 0) return;
    transposeSquareImage(matrix);
    flipHorizontalSquareImage(matrix);
    return;
}
