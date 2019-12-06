// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public class HelperNode {
    public boolean found;
    public int distance;
    public HelperNode(boolean f, int d) {
        found = f;
        distance = d;
    }
}

public HelperNode distanceHelper(TreeNode root, int n1, int n2) {
    if (root == null) return new HelperNode(false, 0);

    HelperNode lhs = distanceHelper(root.left, n1, n2);
    if (lhs.found) return lhs;

    HelperNode rhs = distanceHelper(root.right, n1, n2);
    if (rhs.found) return rhs;

    if (root.data == n1 || root.data == n2) {
        if (lhs.distance != 0) {
            return new HelperNode(true, lhs.distance);
        } else if (rhs.distance != 0) {
            return new HelperNode(true, rhs.distance);
        } else {
            return new HelperNode(false, 1);
        }
    } else {
        if (lhs.distance != 0 && rhs.distance != 0) {
            return new HelperNode(true, lhs.distance + rhs.distance);
        } else if (lhs.distance != 0) {
            return new HelperNode(false, lhs.distance + 1);
        } else if (rhs.distance != 0) {
            return new HelperNode(false, rhs.distance + 1);
        } else {
            return new HelperNode(false, 0);
        }
    }
}

public int getNodeDistance(TreeNode root, int n1, int n2) {
    // level order, sum up the levels found
    if (root == null) return 0;
    HelperNode result = distanceHelper(root, n1, n2);
    return result.distance;
}
