// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public static List<Vertex> getShortestPath(Vertex source, Vertex target) {
    List<Vertex> result = new ArrayList<>();
    if (source.equals(target)) return result;
    Map<Vertex, Double> distances = new HashMap<>();
    Map<Vertex, Vertex> parents = new HashMap<>();
    PriorityQueue<Vertex> pq = new PriorityQueue<>();
    source.minDistance = 0;
    source.previous = null;
    pq.add(source);
    Vertex src;
    Vertex dst;
    while (!pq.isEmpty()) {
        src = pq.remove();
        for (Edge neighbor : src.adjacencies) {
            dst = neighbor.target;
            double last = dst.minDistance;
            double curr = src.minDistance + neighbor.weight;
            if (curr < last) {
                dst.minDistance = curr;
                dst.previous = src;
                pq.add(dst);
            }
            if (dst.name.equals(target.name)) break;
        }
    }
    src = target;
    while (!src.name.equals(source.name)) {
        result.add(src);
        src = src.previous;
    }
    result.add(src);
    Collections.reverse(result);
    return result;
}
