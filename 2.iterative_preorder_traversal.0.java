// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ArrayList<Integer> preorderItr(TreeNode root) {
    if (root == null) return new ArrayList<>();
    List<TreeNode> stack = new ArrayList<>();
    ArrayList<Integer> res = new ArrayList<>();
    stack.add(root);
    TreeNode temp;
    while (!stack.isEmpty()) {
        temp = stack.remove(stack.size() - 1);
        res.add(temp.data);
        if (temp.right != null)
            stack.add(temp.right);
        if (temp.left !=
                null)
            stack.add(temp.left);
    }
    return res;
}
