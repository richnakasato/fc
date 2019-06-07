// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String replace(String a, String b) {
    StringBuilder str = new StringBuilder();
    for (char c : a.toCharArray()) {
        if (c != ' ') str.append(c);
        else str.append(b);
    }
    return str.toString();
}
