// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int swapHelper(TreeNode curr, int swapValue) {
    if (curr == null) return swapValue;
    if (curr.left == null) {
        int temp = curr.data;
        curr.data = swapValue;
        return temp;
    }
    return swapHelper(curr.left, swapValue);
}

public TreeNode delete(TreeNode root, int data) { 
    if (root == null) return null;
    if (root.data == data) {
        if (root.left == null) return root.right;
        else if (root.right == null) return root.left;
        else {
            root.data = swapHelper(root.right, data);
        }
    }
    root.left = delete(root.left, data);
    root.right = delete(root.right, data);
    return root;
}
