// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String reverseString(String str){
    if (str == null) return str;
    String inputString = str;
    String outputString = null;
    char[] outputBuffer = inputString.toCharArray();
    int lhs = 0, rhs = str.length() - 1;
    while (lhs < rhs) {
        char temp = outputBuffer[lhs];
        outputBuffer[lhs] = outputBuffer[rhs];
        outputBuffer[rhs] = temp;
        lhs++;
        rhs--;
    }
    return new String(outputBuffer);
}
