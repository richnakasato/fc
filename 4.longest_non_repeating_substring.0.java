// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int longestNRSubstringLen(String input) {
    if (input.length() < 2) return input.length();
    int max = Integer.MIN_VALUE;
    Map<Character, Integer> counts = new HashMap<>();
    int lhs = 0;
    int rhs = 0;
    boolean done = false;
    while (rhs < input.length()) {
        Character rhsChar = input.charAt(rhs);
        int rhsCount = counts.containsKey(rhsChar) ? counts.get(rhsChar) + 1 : 1;
        counts.put(rhsChar, rhsCount);
        while (counts.get(rhsChar) > 1 && lhs < rhs) {
            Character lhsChar = input.charAt(lhs);
            counts.put(lhsChar, counts.get(lhsChar) - 1);
            lhs++;
        }
        rhs++;
        max = Math.max(max, rhs - lhs);
        
    }
    return max;
}
