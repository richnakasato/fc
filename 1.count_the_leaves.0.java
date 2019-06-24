// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int numberOfLeaves(TreeNode root) {
    if (root == null) return 0;
    int left = numberOfLeaves(root.left);
    int right = numberOfLeaves(root.right);
    return left + right == 0 ? 1 : left + right;
}
