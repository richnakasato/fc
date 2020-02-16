// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String insertPairStar(String s) {
    if (s == null || s.length() < 2) return s;
    StringBuilder prefix = new StringBuilder(s.substring(0,1));
    if (s.charAt(0) == s.charAt(1)) {
        prefix.append("*");
    }
    return prefix.toString() + insertPairStar(s.substring(1));
}
