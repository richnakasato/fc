// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void helper(Set<Character> chars, StringBuilder curr, ArrayList<String> results) {
    if (chars.isEmpty()) {
        results.add(curr.toString());
        return;
    }
    for (Character c : chars) {
        Set<Character> copy = new HashSet<Character>(chars);
        copy.remove(c);
        curr.append(c);
        helper(copy, curr, results);
        curr.setLength(curr.length() - 1);
    }
    return;
}

public static ArrayList<String> getPermutations(String s) {
    if (s == null) return null;
    ArrayList<String> results = new ArrayList<>();
    if (s.length() > 0) {
        Set<Character> chars = new HashSet<>();
        for (int i=0; i<s.length(); i++) {
            chars.add(s.charAt(i));
        }
        helper(chars, new StringBuilder(), results);
    }
    return results;
}
