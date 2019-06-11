// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static Character firstNonRepeatedCharacter(String str) {
    Map<Character, Integer> lookup = new LinkedHashMap<Character, Integer>();
    for (char c : str.toCharArray()) {
        if (lookup.containsKey(c)) {
            lookup.put(c, lookup.get(c) + 1);
        } else {
            lookup.put(c, 1);
        }
    }
    for (Map.Entry<Character, Integer> pair : lookup.entrySet()) {
        if (pair.getValue() == 1) return pair.getKey();
    }
    return null;
}
