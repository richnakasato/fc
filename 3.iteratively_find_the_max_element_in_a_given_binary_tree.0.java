// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int findMaxItr(TreeNode root) {
    int max = Integer.MIN_VALUE;
    if (root == null) return max;
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    TreeNode curr;
    while (!q.isEmpty()) {
        curr = q.remove();
        max = Math.max(max, curr.data);
        if (curr.left != null) q.add(curr.left);
        if (curr.right != null) q.add(curr.right);
    }
    return max;
}
