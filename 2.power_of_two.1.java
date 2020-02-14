// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean isPowOfTwo(int num) {
    return (num & (num - 1)) == 0;
}
