// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean isStringPalindrome(String str){
    if (str == null) return true;
    char[] c_arr = str.toCharArray();
    if (c_arr.length < 2) return true;
    int lhs=0;
    int rhs=c_arr.length - 1;
    while (lhs < rhs) {
        if (c_arr[lhs] != c_arr[rhs]) {
            return false;
        }
        lhs += 1;
        rhs -= 1;
    }
    return true;
}
