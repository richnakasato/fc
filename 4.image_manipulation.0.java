// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int[][] rotate(int[][] matrix) {
    if (matrix.length < 2 || matrix[0].length < 2) return matrix;
    int top = 0;
    int bot = matrix.length - 1;
    int rhs = matrix[0].length - 1;
    int lhs = 0;
    int row;
    int col;
    int[] temp = new int[matrix.length];
    while (top < bot && lhs < rhs) {
        int delta = bot - top;
        for (int i=0; i<delta; i++) {
            temp[i] = matrix[top][lhs+i];
            matrix[top][lhs+i] = matrix[bot-i][lhs];
        }
        for (int i=0; i<delta; i++) {
            matrix[bot-i][lhs] = matrix[bot][rhs-i];
        }
        for (int i=0; i<delta; i++) {
            matrix[bot][rhs-i] = matrix[top+i][rhs];
        }
        for (int i=0; i<delta; i++) {
            matrix[top+i][rhs] = temp[i];
        }
        top += 1;
        bot -= 1;
        lhs += 1;
        rhs -= 1;
    }
    return matrix;
}
