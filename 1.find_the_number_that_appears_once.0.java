// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int singleNumber(int[] A) {
    Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
    for (int num : A) {
        if (counts.containsKey(num)) {
            counts.put(num, counts.get(num) + 1);
        } else {
            counts.put(num, 1);
        }
    }
    for (int num : A) {
        if (counts.get(num) == 1) {
            return num;
        }
    }
    return -1;
}
