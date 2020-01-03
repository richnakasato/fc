// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public boolean depthFirstSearch(Node rootNode, String data) {
    if (rootNode == null) return false;
    if (!rootNode.visited) {
        rootNode.visited = true;
        if (rootNode.data == data) return true;
        for (Node n : rootNode.adjacentNodes) {
            boolean temp = depthFirstSearch(n, data);
            if (temp) return true;
        }
    }
    return false;
}
