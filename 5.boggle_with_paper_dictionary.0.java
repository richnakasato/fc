// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
// Some methods and signatures you'll find useful.
// Click 'Hide' to hide me.

/**
 * For Reference Only. Construct your
 * own TrieNode and Trie!
 */

class TrieNode {
    public Character c;
    public Boolean isLeaf = false;
    public HashMap<Character, TrieNode> children = new HashMap<>();
    public TrieNode() {
        this.c = ' ';
    };
    public TrieNode(Character c) {
        this.c = c;
    };
}

class Trie {
    private TrieNode root;
    public Trie() {
        this.root = new TrieNode();
    };
    public void insertWord(String word) {
        TrieNode curr = this.root;
        for (char c : word.toCharArray()) {
            if (!curr.children.containsKey(c)) {
                TrieNode temp = new TrieNode(c);
                curr.children.put(c, temp);
            }
            curr = curr.children.get(c);
        }
        curr.isLeaf = true;
    };
    public Boolean searchWord(String word) {
        TrieNode curr = this.root;
        for (char c : word.toCharArray()) {
            if (!curr.children.containsKey(c)) return false;
            curr = curr.children.get(c);
        }
        return curr.isLeaf;
    };
    public Boolean searchPrefix(String word) {
        TrieNode curr = this.root;
        for (char c : word.toCharArray()) {
            if (!curr.children.containsKey(c)) return false;
            curr = curr.children.get(c);
        }
        return true;
    };
}

public boolean helper(char[][] board,
                      boolean[][] used,
                      int row,
                      int col,
                      StringBuilder curr,
                      Trie dict) {
    if (dict.searchWord(curr.toString())) return true;
    if (!dict.searchPrefix(curr.toString())) return false;
    if (0 > row || row > board.length || 0 > col || col > board[0].length) return false;
    if (used[row][col]) return false;
    used[row][col] = true;
    char c = board[row][col];
    curr.append(c);
    if (helper(board, used, row - 1, col, curr, dict)) return true;
    if (helper(board, used, row + 1, col, curr, dict)) return true;
    if (helper(board, used, row, col - 1, curr, dict)) return true;
    if (helper(board, used, row, col + 1, curr, dict)) return true;
    curr.setLength(curr.length() - 1);
    used[row][col] = false;
    return false;
}

public ArrayList<String> boggleByot(char[][] board, ArrayList<String> dictionary) {
    // insert all words into Trie
    // backtrack across all elements of board looking for words
    Trie dict = new Trie();
    for (String word : dictionary) {
        dict.searchWord(word);
    }
    boolean[][] used = new boolean[board.length][board[0].length];
    ArrayList<String> result = new ArrayList<>();
    for (int r=0; r<board.length; r++) {
        for (int c=0; c<board[0].length; c++) {
            for (String word : dictionary) {
                if (helper(board, used, r, c, new StringBuilder(), dict)) result.add(word);
            }
        }
    }
    Collections.sort(result);
    return result;
}
