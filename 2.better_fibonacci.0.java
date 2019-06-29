// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int betterFibonacci(int n) {
    if (n < 2) return n;
    int n_minus_one = 1;
    int n_minus_two = 0;
    int idx = 1;
    int curr = 0;
    while (idx < n) {
        curr = n_minus_one + n_minus_two;
        n_minus_two = n_minus_one;
        n_minus_one = curr;
        idx++;
    }
    return curr;
}
