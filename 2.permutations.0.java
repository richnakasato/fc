// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean permutation(String str1, String str2) {
    Map<Character, Integer> counts = new HashMap<Character, Integer>();
    for (char ch : str1.toCharArray()) {
        if (counts.containsKey(ch)) {
            counts.put(ch, counts.get(ch) + 1);
        } else {
            counts.put(ch, 1);
        }
    }
    for (char ch : str2.toCharArray()) {
        if (counts.containsKey(ch)) {
            counts.put(ch, counts.get(ch) - 1);
        } else {
            counts.put(ch, -1);
        }
    }
    for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
        if (entry.getValue() != 0) return false;
    }
    return true;
}
