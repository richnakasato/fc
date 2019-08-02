i// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int maxProfit(int[] a) {
    if (a.length < 2) return 0;
    int sum = 0;
    for (int i=1; i<a.length; i++) {
        int temp = a[i] - a[i-1];
        sum += Math.max(temp, 0);
    }
    return sum;
}
