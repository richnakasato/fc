// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean isIsomorphic(String input1, String input2) {
    if (input1.length() != input2.length()) return false;
    Map<Character, Integer> map1 = new HashMap<>();
    Map<Integer, Integer> counts = new HashMap<>();
    int counter = 0;
    for (int i=0; i<input1.length(); i++) {
        char ch = input1.charAt(i);
        if (!map1.containsKey(ch)) {
            map1.put(ch, counter);
            counter += 1;
        }
        int key = map1.get(ch);
        int val = 0;
        if (counts.containsKey(key)) {
            val = counts.get(key);
        }
        counts.put(key, val + 1);
    }
    Map<Character, Integer> map2 = new HashMap<>();
    counter = 0;
    for (int i=0; i<input2.length(); i++) {
        char ch = input2.charAt(i);
        if (!map2.containsKey(ch)) {
            map2.put(ch, counter);
            counter += 1;
        }
        int key = map2.get(ch);
        int val = 0;
        if (counts.containsKey(key)) {
            val = counts.get(key);
        }
        counts.put(key, val - 1);
    }
    for (Integer key : counts.keySet()) {
        if (counts.get(key) != 0) return false;
    }
    return true;
}
