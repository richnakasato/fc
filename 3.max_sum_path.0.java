// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public class Node {
    int maxLeg;
    int maxDia;
    public Node() {
        maxLeg = 0;
        maxDia = 0;
    }
}

public Node helper(TreeNode root) {
    Node curr = new Node();   
    if (root == null) return curr;
    Node lhs = helper(root.left);
    Node rhs = helper(root.right);
    curr.maxLeg = root.data + Math.max(lhs.maxLeg, rhs.maxLeg);
    curr.maxDia = Math.max(lhs.maxDia, rhs.maxDia);
    return curr;
}

public int maxSumPath(TreeNode root) {
    if (root == null) return 0;
    Node lhs = helper(root.left);
    Node rhs = helper(root.right);
    int cur = root.data + lhs.maxLeg + rhs.maxLeg;
    int maxDia = Math.max(lhs.maxDia, rhs.maxDia);
    return Math.max(cur, maxDia);
}
