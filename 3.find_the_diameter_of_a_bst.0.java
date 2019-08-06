// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public class Metrics {
    int maxHeight = 0;
    int maxDiameter = 0;
}

public Metrics diameter_helper(TreeNode root) {
    Metrics left = new Metrics();
    if (root.left !=null) left = diameter_helper(root.left);
    Metrics right = new Metrics();
    if (root.right != null) right = diameter_helper(root.right);
    Metrics curr = new Metrics();
    curr.maxHeight = 1 + Math.max(left.maxHeight, right.maxHeight);
    int currDiameter = 1 + left.maxHeight + right.maxHeight;
    curr.maxDiameter = Math.max(currDiameter, Math.max(left.maxDiameter, right.maxDiameter));
    return curr;
}

public int diameter(TreeNode root) {
    if (root == null) return 0;
    Metrics curr = diameter_helper(root);
    return curr.maxDiameter;
}
