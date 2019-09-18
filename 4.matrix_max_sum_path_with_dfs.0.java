// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public static void helper(int[][] grid, int r, int c, int curSum, List<Integer> sums) {
    if (r >= grid.length || c >= grid[0].length) {
        sums.add(curSum);
        return;
    }
    int val = grid[r][c];
    helper(grid, r, c + 1, curSum + val, sums);
    helper(grid, r + 1, c, curSum + val, sums);
    return;
}

public static int matrixMaxSumDfs(int[][] grid) {
    if (grid.length < 1 || grid[0].length < 1) return 0;
    List<Integer> sums = new ArrayList<>();
    helper(grid, 0, 0, 0, sums);
    int maxSum = Integer.MIN_VALUE;
    for (Integer sum : sums) {
        maxSum = Math.max(maxSum, sum);
    }
    return maxSum;
}
