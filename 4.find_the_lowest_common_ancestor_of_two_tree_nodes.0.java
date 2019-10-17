// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public TreeNode findLCA(TreeNode root, TreeNode a, TreeNode b) {
    if (root == null) return root;
    if (root.data == a.data || root.data == b.data) return root;
    TreeNode lhs = findLCA(root.left, a, b);
    TreeNode rhs = findLCA(root.right, a, b);
    if (lhs != null && rhs != null) return root;
    if (rhs == null) return lhs;
    return rhs;
}
