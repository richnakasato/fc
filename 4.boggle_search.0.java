// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public static boolean validMove(char[][] board, boolean[][] free, int row, int col) {
    int minRow = 0;
    int minCol = 0;
    int maxRow = board.length;
    int maxCol = board[0].length;
    return minRow <= row 
        && row < maxRow 
        && minCol <= col 
        && col < maxCol 
        && free[row][col];
}

public static boolean matchChar(char[][] board, String word, int idx, int row, int col) {
    return word.charAt(idx) == board[row][col];
}

public static boolean helper(char[][] board, boolean[][] free, String word, int idx, int row, int col) {
    if (word.length() == idx) {
        return true;
    }
    if (validMove(board, free, row, col) && matchChar(board, word, idx, row, col)) {
        free[row][col] = false;
        idx+=1;
        boolean up = helper(board, free, word, idx, row-1, col);
        boolean left = helper(board, free, word, idx, row, col-1);
        boolean down = helper(board, free, word, idx, row+1, col);
        boolean right = helper(board, free, word, idx, row, col+1);
        idx-=1;
        free[row][col] = true;
        return up || left || down || right;
        
    }
    return false;
}

public static boolean boggleSearch(char[][] board, String word){
    if (word == null || board == null) return false;
    if (word.length() < 1 || board.length < 1 || board[0].length < 1) return false;
    boolean[][] free = new boolean[board.length][board[0].length];
    for (boolean[] row: free)
        Arrays.fill(row, true);
    for (int r=0; r<board.length; r++) {
        for (int c=0; c<board[0].length; c++) {
            if (helper(board, free, word, 0, r, c)) return true;
        }
    }
    return false;
}
