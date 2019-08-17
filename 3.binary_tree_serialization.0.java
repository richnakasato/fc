// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public class QueueNode {
    public TreeNode node;
    public int level;

    public QueueNode(TreeNode n, int l) {
        node = n;
        level = l;
    }
}

public String[] binaryTreeArrayBuilder(TreeNode root) {
    if (root == null) return new String[0];
    QueueNode temp = new QueueNode(root, 1);
    Queue<QueueNode> q = new LinkedList<>();
    q.add(temp);
    int counter = Integer.MIN_VALUE;
    while (!q.isEmpty()) {
        temp = q.remove();
        counter = Math.max(counter, temp.level);
        if (temp.node.left != null) {
            QueueNode left = new QueueNode(temp.node.left, temp.level + 1);
            q.add(left);
        }
        if (temp.node.right != null) {
            QueueNode right = new QueueNode(temp.node.right, temp.level + 1);
            q.add(right);
        }
    }
    Double sz = Math.pow(2, counter) - 1;
    String[] arr = new String[sz.intValue()];
    for (int i=0; i<arr.length; i++) {
        arr[i] = "-";
    }
    return arr;
}

public void serializeTreeHelper(TreeNode curr, String[] arr, int pos) {
    if (curr != null) {
        arr[pos] = String.valueOf(curr.data);
        serializeTreeHelper(curr.left, arr, 2*pos + 1);
        serializeTreeHelper(curr.right, arr, 2*pos + 2);
    }
    return;
}

public String serializeTree(TreeNode root){
    String[] arr = binaryTreeArrayBuilder(root);
    serializeTreeHelper(root, arr, 0);
    StringBuilder sb = new StringBuilder();
    for (String s : arr) {
        sb.append(s);
    }
    String result = sb.toString();
    System.out.println(result);
    return result;
}

public TreeNode restoreTreeHelper(String str, int pos) {
    if (pos >= str.length() || str.charAt(pos) == '-') return null;
    TreeNode temp = new TreeNode(Character.getNumericValue(str.charAt(pos)));
    temp.left = restoreTreeHelper(str, 2*pos + 1);
    temp.right = restoreTreeHelper(str, 2*pos + 2);
    return temp;
}

public TreeNode restoreTree(String str){
    if (str.isEmpty()) return null;
    return restoreTreeHelper(str, 0);
}
