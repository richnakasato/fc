// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public static int calcMaxSum(int[][] grid, int[][] sums, int r, int c) {
    int sum = 0;
    if (r == 0 && c == 0) {
        sum = 0;
    } else if (r == 0) {
        sum = sums[r][c-1];
    } else if (c == 0) {
        sum = sums[r-1][c];
    } else {
        sum = Math.max(sums[r-1][c], sums[r][c-1]);
    }
    return grid[r][c] + sum;
}

public static int matrixMaxSumDP(int[][] grid) {
    if (grid.length == 0 || grid[0].length == 0) return 0;
    int[][] sums = new int[grid.length][grid[0].length];
    sums[0][0] = grid[0][0];
    for (int r=0; r<grid.length; r++) {
        for (int c=0; c<grid[0].length; c++) {
            sums[r][c] = calcMaxSum(grid, sums, r, c);
        }
    }
    return sums[grid.length-1][grid[0].length-1];
}
