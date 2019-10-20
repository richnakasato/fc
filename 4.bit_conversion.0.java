// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int bitSwapRequired(int a, int b) {
    int xor = a ^ b;
    int count = 0;
    while (xor > 0) {
        xor &= (xor - 1);
        count++;
    }
    return count;
}
