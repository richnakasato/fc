// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean isPowOfTwo(int num) {
	// real answer is (n & n-1)
    int count = 0;
    while (num != 0) {
        count += num & 0x1;
        num = num >> 1;
    }
    return count == 1 ? true : false;
}
