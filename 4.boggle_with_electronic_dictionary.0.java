// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public boolean shouldMove(char[][] board, boolean[][] used, Trie dict, int r, int c, StringBuilder curr) {
    return 0 <= r && r < board.length 
        && 0 <= c && c < board[0].length 
        && !used[r][c] 
        && dict.searchPrefix(curr.toString());
}

public void helper(char[][] board, boolean[][] used, Trie dict, int r, int c, StringBuilder curr, TreeSet<String> res) {
    String test = curr.toString();
    if (dict.searchWord(test)) {
        res.add(test);
    }
    curr.append(String.valueOf(board[r][c]));
    used[r][c] = true;
    if (shouldMove(board, used, dict, r-1, c, curr)) {
        helper(board, used, dict, r-1, c, curr, res);
    }
    if (shouldMove(board, used, dict, r, c-1, curr)) {
        helper(board, used, dict, r, c-1, curr, res);
    }
    if (shouldMove(board, used, dict, r+1, c, curr)) {
        helper(board, used, dict, r+1, c, curr, res);
    }
    if (shouldMove(board, used, dict, r, c+1, curr)) {
        helper(board, used, dict, r, c+1, curr, res);
    }
    used[r][c] = false;
    curr.setLength(curr.length() - 1);
    return;
}

public ArrayList<String> boggleSearchWithDict(char[][] board, Trie dictionary) {
    ArrayList<String> results = new ArrayList<>();
    if (board.length < 1 || board[0].length < 1) return results;
    TreeSet<String> res = new TreeSet<>();
    boolean[][] used = new boolean[board.length][board[0].length];
    for (int r=0; r<board.length; r++) {
        for (int c=0; c<board[0].length; c++) {
            helper(board, used, dictionary, r, c, new StringBuilder(), res);
        }
    }
    for (String entry : res) {
        results.add(entry);
    }
    return results;
}
