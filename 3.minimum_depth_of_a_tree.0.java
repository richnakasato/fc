// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public class QueueNode {
    TreeNode node;
    int depth;

    public QueueNode(TreeNode n, int d) {
        this.node = n;
        this.depth = d;
    }
}

public int minTreeDepth(TreeNode root) {
    if (root == null) return 0;
    Queue<QueueNode> q = new LinkedList<>();
    QueueNode temp = new QueueNode(root, 1);
    q.add(temp);
    int minDepth = Integer.MAX_VALUE;
    while (!q.isEmpty()) {
        temp = q.remove();
        if (temp.node.left == null && temp.node.right == null) minDepth = Math.min(minDepth, temp.depth);
        if (temp.node.left != null) q.add(new QueueNode(temp.node.left, temp.depth + 1));
        if (temp.node.right != null) q.add(new QueueNode(temp.node.right, temp.depth + 1));
    }
    return minDepth;
}
