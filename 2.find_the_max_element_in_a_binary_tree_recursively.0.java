// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int findMax(TreeNode root) {
    if (root == null) return Integer.MIN_VALUE;
    int curr_val = root.data;
    int child_max = Math.max(findMax(root.left), findMax(root.right));
    return Math.max(curr_val, child_max);
}
