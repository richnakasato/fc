// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

class TrieNode {
    Character c;
    Boolean isLeaf = false;
    HashMap<Character, TrieNode> children = new HashMap<>();
    public TrieNode() {}
    public TrieNode(Character c) {
        this.c = c;
    }
}

class Trie {
    private TrieNode root;
    
    // Implement these methods : 
    public Trie() {
        root = new TrieNode(' ');
    }
    private void insertChar(TrieNode parent, String word, int idx) {
        if (idx == word.length()) {
            parent.isLeaf = true;
            return;
        }
        char c = word.charAt(idx);
        if (!parent.children.containsKey(c)) {
            parent.children.put(c, new TrieNode(c));
        }
        insertChar(parent.children.get(c), word, idx + 1);
        return;
    }
    public void insertWord(String word) {
        if (word != null) insertChar(root, word, 0);
    }
    private Boolean searchChar(TrieNode parent, String word, int idx) {
        if (idx == word.length()) {
            return parent.isLeaf;
        }
        char c = word.charAt(idx);
        if (!parent.children.containsKey(c)) {
            return false;
        }
        return searchChar(parent.children.get(c), word, idx + 1);
    }
    public Boolean searchWord(String word) {
        return !word.equals("") && searchChar(root, word, 0);
    }
    private Boolean searchPrefix(TrieNode parent, String word, int idx) {
        if (idx == word.length()) return true;
        char c = word.charAt(idx);
        if (!parent.children.containsKey(c)) return false;
        return searchPrefix(parent.children.get(c), word, idx + 1);
    }
    public Boolean searchPrefix(String word) {
        return searchPrefix(root, word, 0);   
    }
}
