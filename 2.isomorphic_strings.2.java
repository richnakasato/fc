// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean isIsomorphic(String input1, String input2) {
    if (input1.length() != input2.length()) return false;
    int counter = 0;
    Map<Character, Integer> memo1 = new HashMap<>();
    Map<Integer, Integer> counts = new HashMap<>();
    for (int i=0; i<input1.length(); i++) {
        char c = input1.charAt(i);
        if (!memo1.containsKey(c)) {
            memo1.put(c, counter);
            counter++;
        }
        int countsKey = memo1.get(c);
        if (!counts.containsKey(countsKey)) {
            counts.put(countsKey, 0);
        }
        int countsVal = counts.get(countsKey);
        counts.put(countsKey, countsVal + 1);
    }
    counter = 0;
    Map<Character, Integer> memo2 = new HashMap<>();
    for (int i=0; i<input2.length(); i++) {
        char c = input2.charAt(i);
        if (!memo2.containsKey(c)) {
            memo2.put(c, counter);
            counter++;
        }
        int countsKey = memo2.get(c);
        if (!counts.containsKey(countsKey)) {
            counts.put(countsKey, 0);
        }
        int countsVal = counts.get(countsKey);
        counts.put(countsKey, countsVal - 1);
    }
    for (Integer key : counts.keySet()) {
        if (counts.get(key) != 0) {
            return false;
        }
    }
    return true;
}
