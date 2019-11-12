// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public class Node {
    int level;
    TreeNode treeNode;
    public Node(int l, TreeNode t) {
        level = l;
        treeNode = t;
    }
}

public ArrayList<Integer> levelorderRev(TreeNode root) { 
    ArrayList<Integer> results = new ArrayList<>();
    if (root == null) return results;
    Queue<Node> levelOrder = new LinkedList<>();
    levelOrder.add(new Node(0, root));
    Stack<ArrayList<Integer>> reverseOrder = new Stack<>();
    while (!levelOrder.isEmpty()) {
        Node temp = levelOrder.remove();
        if (temp.level == reverseOrder.size()) {
             reverseOrder.push(new ArrayList<>());
        }
        reverseOrder.peek().add(temp.treeNode.data);
        if (temp.treeNode.left != null) {
            levelOrder.add(new Node(temp.level + 1,
                                    temp.treeNode.left));
        }
        if (temp.treeNode.right != null) {
            levelOrder.add(new Node(temp.level + 1,
                                    temp.treeNode.right));
        }
    }
    while (!reverseOrder.isEmpty()) {
        results.addAll(reverseOrder.pop());
    }
    return results;
}
