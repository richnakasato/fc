// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int minWeightedPath(int[][] grid) {
    if (grid.length == 0) return 0;
    if (grid[0].length == 0) return 0;
    int[][] sums = new int[grid.length][grid[0].length];
    sums[0][0] = grid[0][0];
    for (int r=1; r<grid.length; r++) {
        sums[r][0] = sums[r-1][0] + grid[r][0];
    }
    for (int c=1; c<grid[0].length; c++) {
        sums[0][c] = sums[0][c-1] + grid[0][c];
    }
    for (int r=1; r<grid.length; r++) {
        for (int c=1; c<grid[0].length; c++) {
            sums[r][c] = Math.min(sums[r-1][c], sums[r][c-1]) + grid[r][c];
        }
    }
    return sums[grid.length-1][grid[0].length-1];
}
