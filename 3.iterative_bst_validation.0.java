// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public class QueueNode {
    int min;
    TreeNode node;
    int max;
    public QueueNode(TreeNode node) {
        this.min = Integer.MIN_VALUE;
        this.node = node;
        this.max = Integer.MAX_VALUE;
    }
    public QueueNode(int min, TreeNode node, int max) {
        this.min = min;
        this.node = node;
        this.max = max;
    }
}

public boolean validateBSTItr(TreeNode root) {
    if (root == null) return true;
    Queue<QueueNode> q = new LinkedList<>();
    q.add(new QueueNode(root));
    QueueNode temp;
    while (!q.isEmpty()) {
        temp = q.remove();
        if (temp.min >= temp.node.data || temp.max <= temp.node.data) {
            return false;
        }
        if (temp.node.left != null) {
            q.add(new QueueNode(temp.min, temp.node.left, temp.node.data));
        }
        if (temp.node.right != null) {
            q.add(new QueueNode(temp.node.data, temp.node.right, temp.max));
        }
    }
    return true;
}
