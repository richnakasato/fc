// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public TreeNode findKthSmallest(TreeNode root, int k) {
    if (root == null || k < 1) return null;
    ArrayList<TreeNode> stack = new ArrayList<TreeNode>();
    boolean done = false;
    TreeNode curr = root;
    int count = 0;
    while (!done) {
        if (curr != null) {
            stack.add(curr);
            curr = curr.left;
        } else {
            if (!stack.isEmpty()) {
                curr = stack.remove(stack.size() - 1);
                ++count;
                if (count == k) {
                    done = true;
                    break;
                }
                curr = curr.right;
            } else {
                done = true;
            }
        }
    }
    return count == k ? curr : null;
}
