// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public TreeNode findMin(TreeNode root) {
    if (root == null) return null;
    TreeNode left = findMin(root.left);
    return left != null ? left : root;
}
