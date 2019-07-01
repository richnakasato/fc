// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int maxGain(int[] a) {
    if (a.length < 2) return 0;
    int smallest = a[0];
    int max_gain = 0;
    for (int i=1; i<a.length; i++) {
        int curr_gain = a[i] - smallest;
        max_gain = curr_gain < max_gain ? max_gain : curr_gain;
        smallest = smallest < a[i] ? smallest : a[i];
    }
    return max_gain;
}
