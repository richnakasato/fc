// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean isHappyNumber(int n) {
    Set<Integer> seen = new HashSet<>();
    int target = 1;
    int curr = n;
    int accumulate;
    while (curr != target) {
        accumulate = 0;
        while (curr != 0) {
            accumulate += Math.pow((curr % 10), 2);
            curr /= 10;
        }
        curr = accumulate;
        if (seen.contains(curr)) break;
        seen.add(curr);
    }
    return curr == target ? true : false;
}
