// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int[][] filler(int row, int col) {
    int[][] edits = new int[row][col];
    for (int r=0; r<row; r++) {
        edits[r][0] = r;
    }
    for (int c=1; c<col; c++) {
        edits[0][c] = c;
    }
    return edits;
}

public int helper(int[][] edits, char a, char b, int row, int col) {
    if (a == b) {
        return edits[row - 1][col - 1];
    }
    int diag = edits[row - 1][col - 1];
    int left = edits[row][col - 1];
    int top = edits[row - 1][col];
    return Math.min(diag, Math.min(top, left)) + 1;
}

public int editDistance(String a, String b) {
    if (a.length() == 0 && b.length() == 0) return 0;
    if (a.length() == 0 && b.length() != 0) return b.length();
    if (a.length() != 0 && b.length() == 0) return a.length();
    int[][] edits = filler(a.length() + 1, b.length() + 1);
    for (int r=1; r<a.length() + 1; r++) {
        for (int c=1; c<b.length() + 1; c++) {
            edits[r][c] = helper(edits, a.charAt(r-1), b.charAt(c-1), r, c);
        }
    }
    return edits[a.length()][b.length()];
}
