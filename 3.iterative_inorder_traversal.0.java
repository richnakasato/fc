// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ArrayList<Integer> inorderItr(TreeNode root) {
    ArrayList result = new ArrayList<>();
    ArrayList<TreeNode> stack = new ArrayList<>();
    TreeNode curr = root;
    boolean done = false;
    while (!done) {
        if (curr != null) {
            stack.add(curr);
            curr = curr.left;
        } else {
            if (!stack.isEmpty()) {
                curr = stack.remove(stack.size() - 1);
                result.add(curr.data);
                curr = curr.right;
            } else {
                done = true;
            }
        }
    }
    return result;
}
