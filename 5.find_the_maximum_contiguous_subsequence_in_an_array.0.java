// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int[] maxContSequence(int[] arr) {
    int[] gmax = new int[3];
    gmax[2] = -1;
    if (arr.length == 0) return gmax;
    gmax[0] = arr[0];
    gmax[1] = 0;
    gmax[2] = 0;
    int[] lmax = new int[3];
    lmax[0] = arr[0];
    lmax[1] = 0;
    lmax[2] = 0;
    for (int i=1; i<arr.length; i++) {
        if (arr[i] == Math.max(lmax[0] + arr[i], arr[i])) {
            lmax[0] = arr[i];
            lmax[1] = i;
            lmax[2] = i;
        } else {
            lmax[0] += arr[i];
            lmax[2] += 1;
        }
        if (gmax[0] != Math.max(gmax[0], lmax[0])) {
            gmax[0] = lmax[0];
            gmax[1] = lmax[1];
            gmax[2] = lmax[2];
        }
    }
    return gmax;
}
