// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean validateBstHelper(int min, TreeNode root, int max) {
    if (root == null) return true;
    boolean curr = min < root.data && root.data < max;
    boolean left = validateBstHelper(min, root.left, root.data);
    boolean right = validateBstHelper(root.data, root.right, max);
    return left && curr && right;
}

public static boolean validateBST(TreeNode root) {
    return validateBstHelper(Integer.MIN_VALUE, root, Integer.MAX_VALUE);
}
