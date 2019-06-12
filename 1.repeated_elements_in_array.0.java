// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String duplicate(int[] numbers) {
    Map<Integer, Integer> counts = new LinkedHashMap<Integer, Integer>();
    for (Integer num : numbers) {
        if (!counts.containsKey(num)) {
            counts.put(num, 1);
        } else {
            counts.put(num, counts.get(num) + 1);
        }
    }
    List<Integer> results = new ArrayList<Integer>();
    for (Map.Entry<Integer, Integer> pair : counts.entrySet()) {
        if (pair.getValue() > 1) {
            results.add(pair.getKey());
        }
    }
    return results.toString();
}
