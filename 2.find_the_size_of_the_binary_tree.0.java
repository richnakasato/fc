// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int size(TreeNode root) {
    if (root == null) return 0;
    int size = 1;
    size += size(root.left);
    size += size(root.right);
    return size;
}
