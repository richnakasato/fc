// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ArrayList<Integer> preorderItr(TreeNode root) {
    ArrayList<Integer> result = new ArrayList<>();
    if (root == null) return result;
    Stack<TreeNode> preorder = new Stack<>();
    preorder.push(root);
    TreeNode curr;
    while (!preorder.isEmpty()) {
        curr = preorder.pop();
        result.add(curr.data);
        if (curr.right != null) preorder.push(curr.right);
        if (curr.left != null) preorder.push(curr.left);
    }
    return result;
}
