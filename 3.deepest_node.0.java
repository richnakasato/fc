// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public TreeNode findDeepest(TreeNode root) {
    if (root == null) return null;
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    q.add(root);
    TreeNode temp = null;
    while (!q.isEmpty()) {
        temp = q.remove();
        if (temp.left != null) q.add(temp.left);
        if (temp.right != null) q.add(temp.right);
    }
    return temp;
}
