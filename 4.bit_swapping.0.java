// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int swapOddEvenBits(int x) {
    int evens = (x & 0xAAAAAAAA) >> 1;
    int odds = (x & 0x55555555) << 1;
    return evens | odds;
}
