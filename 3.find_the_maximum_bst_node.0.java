// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public TreeNode findMax(TreeNode root) {
    if (root == null) return null;
    if (root.right != null) return findMax(root.right);
    return root;
}
