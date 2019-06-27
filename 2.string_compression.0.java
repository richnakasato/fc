// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String helper(char ch, int count) {
    StringBuilder sb = new StringBuilder();
    sb.append(ch);
    if (count > 1) sb.append(count);
    return sb.toString();
}

public static String compressString(String text) {
    if (text.length() < 2) return text;
    char[] arrText = text.toCharArray();
    StringBuilder sb = new StringBuilder();
    char last = arrText[0];
    int count = 1;
    for (int i=1; i<arrText.length; i++) {
        if (arrText[i] == last) {
            ++count;
        } else {
            sb.append(helper(last, count));
            last = arrText[i];
            count = 1;
        }
    }
    sb.append(helper(last, count));
    return sb.toString();
}
