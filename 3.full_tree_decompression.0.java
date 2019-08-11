// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public TreeNode decompressTreeHelper(String str, int idx) {
    if (idx >= str.length() || str.charAt(idx) == '*') {
        return null;
    }
    TreeNode curr = new TreeNode(Character.getNumericValue(str.charAt(idx)));
    curr.left = decompressTreeHelper(str, 2 * idx + 2);
    curr.right = decompressTreeHelper(str, 2 * idx + 4);
    return curr;
}

public TreeNode decompressTree(String str){
    if (str.isEmpty()) return null;
    return decompressTreeHelper(str, 0);
}
