// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int reverseInt(int x) {
    if (x == 0) return 0;
    boolean isNeg = x < 0;
    if (isNeg) x = -x;
    int res = 0;
    while (x > 0) {
        res += x % 10;
        x /= 10;
        if (x > 0) res *= 10;
    }
    return isNeg ? -res : res;
}
