// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int getMaxRepetition(int[] a) {
    int unit = 1000000;
    for (int i=0; i<a.length; i++) {
        a[a[i]%unit] += unit;
    }
    int max = Integer.MIN_VALUE;
    int num = -1;
    for (int i=0; i<a.length; i++) {
        int count = a[i]/unit;
        max = Math.max(max, count);
        if (max == count) {
            num = i;
        }
    }
    return num;
}
