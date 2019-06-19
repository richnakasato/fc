// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void flipHorizontalAxis(int[][] matrix) {
    if (matrix.length == 0 || matrix[0].length == 0) return;
    int top = 0;
    int bot = matrix.length - 1;
    while (top < bot) {
        for (int i=0; i<matrix[0].length; ++i) {
            int temp = matrix[top][i];
            matrix[top][i] = matrix[bot][i];
            matrix[bot][i] = temp;
        }
        ++top;
        --bot;
    }
    return;
}
