// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String insertPairStar(String s) {
    if (s == null) return null;
    if (s.length() == 0) return "";
    if (s.length() == 1) return s;
    char first = s.charAt(0);
    char[] rest = s.substring(1).toCharArray();
    StringBuilder result = new StringBuilder();
    result.append(first);
    if (first == rest[0]) result.append("*");
    result.append(insertPairStar(new String(rest)));
    return result.toString();
}
