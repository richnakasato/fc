// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
// Some methods and signatures you'll find useful.
// Click 'Hide' to hide me.

/**
 * For Reference Only. Construct your
 * own TrieNode and Trie!
 */

class TrieNode {
    Character c;
    Boolean isLeaf = false;
    HashMap<Character, TrieNode> children = new HashMap<>();
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
        for (Character c : word) {
            if (!curr.children.hasKey(c)) {
                TrieNode temp = new TrieNode(c);
                curr.children.put(c, temp);
            }
            curr = curr.children.getValue(c);
        }
        curr.isLeaf = true;
    };
    public Boolean searchWord(String word) {
        TrieNode curr = this.root;
        for (Character c : word) {
            if (!curr.children.hasKey(c)) return false;
            curr = curr.children.getValue(c);
        }
        return curr.isLeaf;
    };
    public Boolean searchPrefix(String word) {
        Trie curr = this.root;
        for (Character c : word) {
            if (!curr.children.hasKey(c)) return false;
            curr = curr.children.getValue(c);
        }
        return true;
    };
}

public ArrayList<String> boggleByot(char[][] board, ArrayList<String> dictionary) {
    // insert all words into Trie
    // backtrack across all elements of board looking for words
}
