// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public TreeNode findKthLargest(TreeNode root, int k) {
    // try reverse inorder iterative...
    if (root == null || k < 1) return null;
    List<TreeNode> list = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode curr = root;
    boolean done = false;
    while (!done) {
        if (curr != null) {
            stack.push(curr);
            curr = curr.right;
        } else {
            if (!stack.isEmpty()) {
                curr = stack.pop();
                // process
                list.add(curr);
                if (list.size() == k) done = true;
                curr = curr.left;
            } else {
                done = true;
            }
        }
    }
    return list.size() == k ? list.get(k - 1) : null;
}
