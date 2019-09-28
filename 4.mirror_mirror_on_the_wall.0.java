// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public boolean isMirror(TreeNode root1, TreeNode root2) {
    if (root1 == null && root2 == null) return true;
    if (root1 != null && root2 == null) return false;
    if (root1 == null && root2 != null) return false;
    return root1.data == root2.data 
        && isMirror(root1.left, root2.right)
        && isMirror(root1.right, root2.left);
}
