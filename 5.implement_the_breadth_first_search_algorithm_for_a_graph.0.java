// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public boolean breadthFirstSearch(Node rootNode, String data) {
    if (rootNode == null) return false;
    Queue<Node> q = new LinkedList<>();
    q.add(rootNode);
    while (!q.isEmpty()) {
        Node temp = q.remove();
        temp.visited = true;
        if (temp.data == data) {
            return true;
        }
        for (Node n : temp.adjacentNodes) {
            if (!n.visited) {
                q.add(n);
            }
        }
    }
    return false;
}
