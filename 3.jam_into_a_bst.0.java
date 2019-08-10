// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public TreeNode insert(TreeNode root, int data) {
    if (root == null) {
        TreeNode curr = new TreeNode(data);
        return curr;
    }
    if (root.data > data) {
        root.left = insert(root.left, data);
    } else {
        root.right = insert(root.right, data);
    }
    return root;
}
