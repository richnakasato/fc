// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static Boolean isIntPalindrome(int x) {
    if (x < 0) return false;
    if (x == 0) return true;
    int forwards = x;
    int reverse = 0;
    while (x != 0)  {
        reverse += x % 10;
        x /= 10;
        if (x != 0) reverse *= 10;
    }
    return forwards == reverse;
}
