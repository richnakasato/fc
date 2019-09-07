// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int pathLengthFromRoot(TreeNode root, int n1) {
    if (root == null) return 0;
    if (root.data == n1) return 1;
    int left = pathLengthFromRoot(root.left, n1);
    left = left > 0 ? left + 1 : 0;
    int right = pathLengthFromRoot(root.right, n1);
    right = right > 0 ? right + 1 : 0;
    return Math.max(left, right);
}
