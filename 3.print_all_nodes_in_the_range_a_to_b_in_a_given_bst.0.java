// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ArrayList<Integer> rangeList = new ArrayList<Integer>();
public void helper(TreeNode root, int a, int b) {
    if (root == null) return;
    if (root.left != null) helper(root.left, a, b);
    if (a <= root.data && root.data <= b) rangeList.add(root.data);
    if (root.right != null) helper(root.right, a, b);
    return;
}
public void printRange(TreeNode root, int a, int b) {
      if (root == null) return;
      helper(root, a, b);
      return;
}
