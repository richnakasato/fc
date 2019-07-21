// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean isAnagram(String input1, String input2) {
    if (input1 == null || input2 == null) return false;
    if (input1.length() != input2.length()) return false;
    Map<Character, Integer> counts = new HashMap<>();
    for (int i=0; i<input1.length(); i++) {
        if (counts.containsKey(input1.charAt(i))) {
            counts.put(input1.charAt(i), counts.get(input1.charAt(i)) + 1);
        } else {
            counts.put(input1.charAt(i), 1);
        }
        if (counts.containsKey(input2.charAt(i))) {
            counts.put(input2.charAt(i), counts.get(input2.charAt(i)) - 1);
        } else {
            counts.put(input2.charAt(i), -1);
        }
    }
    for (Map.Entry<Character, Integer> e : counts.entrySet()) {
        if (e.getValue() != 0) return false;
    }
    return true;
}
