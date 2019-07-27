// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static double pow(double x, int n) {
    if (n == 0) return 1;
    boolean isNeg = n < 0;
    if (isNeg) n = -n;
    boolean isOdd = n % 2 != 0;
    double xHalfN = pow(x, n/2);
    double xN = xHalfN * xHalfN;
    if (isOdd) xN *= x;
    return isNeg ? 1/xN : xN;
}
