// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public static boolean valid(ArrayList<ArrayList<Integer>> board,
                            int row,
                            int col) {
    return 0 <= row && row < board.size() &&
           0 <= col && col < board.get(row).size();
}

public static void helper(ArrayList<ArrayList<Integer>> board, 
                          int currRow, 
                          int currCol, 
                          int currSum, 
                          ArrayList<Integer> sums) {
    if (!valid(board, currRow, currCol)) {
        sums.add(currSum);
        return;
    }
    currSum += board.get(currRow).get(currCol);
    helper(board, currRow + 1, currCol, currSum, sums);
    helper(board, currRow + 1, currCol + 1, currSum, sums);
    currSum -= board.get(currRow).get(currCol);
    return;
}

public static int minTriangleDepth(ArrayList<ArrayList<Integer>> input) {
    if (input.size() == 0 || input.get(0).size() == 0) return 0;
    ArrayList<Integer> sums = new ArrayList<>();
    helper(input, 0, 0, 0, sums);
    int min = Integer.MAX_VALUE;
    for (int i=0; i<sums.size(); i++) {
        min = Math.min(sums.get(i), min);
    }
    return min;
}
