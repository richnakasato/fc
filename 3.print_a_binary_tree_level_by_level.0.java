// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public class QueueNode {
    public TreeNode node;
    public int level;
    public QueueNode(TreeNode n, int l) {
        node = n;
        level = l;
    }
}

public ArrayList<ArrayList<Integer>> printLevelByLevel(TreeNode root) {
    ArrayList<ArrayList<Integer>> levels = new ArrayList<>();
    if (root == null) return levels;
    Queue<QueueNode> q = new LinkedList<>();
    QueueNode temp = new QueueNode(root, 0);
    q.add(temp);
    int last = 0;
    ArrayList<Integer> curr = new ArrayList<>();
    while (!q.isEmpty()) {
        temp = q.remove();
        if (temp.level != last) {
            levels.add(curr);
            curr = new ArrayList<>();
            last = temp.level;
        }
        curr.add(temp.node.data);
        if (temp.node.left != null) {
            q.add(new QueueNode(temp.node.left, temp.level + 1));
        }
        if (temp.node.right != null) {
            q.add(new QueueNode(temp.node.right, temp.level + 1));
        }
    }
    levels.add(curr);
    return levels;
}
