// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int size(TreeNode root) {
    if (root == null) return 0;
    return 1 + size(root.left) + size(root.right);
}
