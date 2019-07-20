// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean isIsomorphic(String input1, String input2) {
    if (input1.length() != input2.length()) return false;
    int count1 = 0;
    int count2 = 0;
    Map<Character, Integer> map1 = new HashMap<>();
    Map<Character, Integer> map2 = new HashMap<>();
    for (int i=0; i<input1.length(); i++) {
        if (!map1.containsKey(input1.charAt(i))) {
            map1.put(input1.charAt(i), count1++);
        }
        if (!map2.containsKey(input2.charAt(i))) {
            map2.put(input2.charAt(i), count2++);
        }
        if (map1.get(input1.charAt(i)) != map2.get(input2.charAt(i))) {
            return false;
        }
    }
    return true;
}
