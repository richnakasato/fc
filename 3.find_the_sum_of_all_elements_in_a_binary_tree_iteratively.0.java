// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int sumItr(TreeNode root) {
    if (root == null) return 0;
    Stack<TreeNode> s = new Stack<>();
    int sum = 0;
    s.add(root);
    TreeNode temp;
    while (!s.isEmpty()) {
        temp = s.pop();
        sum += temp.data;
        if (temp.left != null) s.add(temp.left);
        if (temp.right != null) s.add(temp.right);
    }
    return sum;
}
