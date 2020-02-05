// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int largestSquare(char[][] matrix) {
    if (matrix.length == 0) return 0;
    if (matrix[0].length == 0) return 0;
    int[][] squares = new int[matrix.length][matrix[0].length];
    for (int r=0; r<matrix.length; r++) {
        squares[r][0] = Character.getNumericValue(matrix[r][0]);
    }
    for (int c=0; c<matrix[0].length; c++) {
        squares[0][c] = Character.getNumericValue(matrix[0][c]);
    }
    int max = Integer.MIN_VALUE;
    for (int r=1; r<matrix.length; r++) {
        for (int c=1; c<matrix[0].length; c++) {
            if (matrix[r][c] == '1') {
                int top = Math.min(squares[r-1][c], squares[r-1][c-1]);
                System.out.println(top);
                int lhs = Math.min(squares[r][c-1], squares[r-1][c-1]);
                System.out.println(lhs);
                squares[r][c] = 1 + Math.min(top, lhs);
                max = Math.max(max, squares[r][c]);
            }
        }
    }
    return max*max;
}
