// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public TreeNode findNode(TreeNode root, int val) {
    if (root == null) return null;
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    TreeNode curr;
    while (!q.isEmpty()) {
        curr = q.remove();
        if (curr.data == val) return curr;
        if (curr.left != null) q.add(curr.left);
        if (curr.right != null) q.add(curr.right);
    }
    return null;
}
