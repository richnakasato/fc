// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int numberOfHalfNodes(TreeNode root) { 
    if (root == null) return 0;
    int left = numberOfHalfNodes(root.left);
    int right = numberOfHalfNodes(root.right);
    int curr = (root.left != null && root.right == null)
            || (root.left == null && root.right != null) ? 1 : 0;
    return left + right + curr;
}
