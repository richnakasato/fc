// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String computeBinary(int val) {
    if (val == 0) return "0";
    StringBuilder sb = new StringBuilder();
    while (val != 0) {
        sb.append(Integer.valueOf(val % 2).toString());
        val /= 2;
    }
    return sb.reverse().toString();
}
