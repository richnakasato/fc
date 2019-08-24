// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

//Populate the list of ancestors from bottom to top in the below list.
public ArrayList<Integer> ancestorsList = new ArrayList<Integer>();

public TreeNode helper(TreeNode curr, int nodeData) {
    if (curr == null) return null;
    if (curr.data == nodeData) return curr;
    TreeNode left = helper(curr.left, nodeData);
    TreeNode right = helper(curr.right, nodeData);
    if (left != null || right != null) {
        ancestorsList.add(curr.data);
        return curr;
    }
    return null;
}

public boolean printAncestors(TreeNode root, int nodeData) {
    return helper(root, nodeData) != null;
}
