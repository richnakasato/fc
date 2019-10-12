// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public class QueueNode {
    public TreeNode node;
    public int level;
    public QueueNode(TreeNode n, int l) {
        this.node = n;
        this.level = l;
    }
}

public int findMaxSumLevel(TreeNode root) {
    int maxLevel = -1;
    int maxSum = 0;
    if (root == null) return maxLevel;
    int currLevel = 0;
    int currSum = 0;
    Queue<QueueNode> levelOrder = new LinkedList<>();
    levelOrder.add(new QueueNode(root, currLevel));
    QueueNode temp;
    while (!levelOrder.isEmpty()) {
        temp = levelOrder.remove();
        if (currLevel == temp.level) {
            currSum += temp.node.data;
        } else {
            maxSum = Math.max(maxSum, currSum);
            if (maxSum == currSum) maxLevel = currLevel;
            currLevel = temp.level;
            currSum = temp.node.data;
        }
        if (temp.node.left != null) {
            levelOrder.add(new QueueNode(temp.node.left, currLevel + 1));
        }
        if (temp.node.right != null) {
            levelOrder.add(new QueueNode(temp.node.right, currLevel + 1));
        }
    }
    maxSum = Math.max(maxSum, currSum);
    if (maxSum == currSum) maxLevel = currLevel;
    return maxLevel;
}
