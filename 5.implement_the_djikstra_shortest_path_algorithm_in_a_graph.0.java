// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static List<Vertex> getShortestPath(Vertex source, Vertex target) {
    ArrayList<Vertex> result = new ArrayList<>();
    if (source.equals(target)) return result;

    HashMap<Vertex, Vertex> parents = new HashMap<>();
    HashMap<Vertex, Double> distances = new HashMap<>();
    HashSet<Vertex> unprocessed = new HashSet<>();
    HashSet<Vertex> processed = new HashSet<>();

    source.minDistance = 0.0;
    source.previous = null;
    pq.add(source);

    Vertex curr = null;
    while(!pq.isEmpty()) {
        curr = pq.remove();
        if (!processed.contains(curr)) {
            processed.add(curr);
        }
    }
    return result;
}
