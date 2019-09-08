// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int numberOfFullNodes(TreeNode root) {
    if (root == null) return 0;
    int self = root.left != null && root.right != null ? 1 : 0;
    return self + numberOfFullNodes(root.left) + numberOfFullNodes(root.right);
}
