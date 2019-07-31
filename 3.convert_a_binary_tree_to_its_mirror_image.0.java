// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public TreeNode mirror(TreeNode root) {
     if (root == null) return root;
     TreeNode new_left = mirror(root.right);
     TreeNode new_right = mirror(root.left);
     root.left = new_left;
     root.right = new_right;
     return root;
}
