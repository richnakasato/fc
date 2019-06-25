// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int[] coupleSum(int[] numbers, int target) {
    Map<Integer, Integer> seen = new HashMap<Integer, Integer>();
    for (int i=0; i<numbers.length; i++) {
        int curr_num = numbers[i];
        if (seen.containsKey(target - curr_num)) {
            int seen_idx = seen.get(target - curr_num);
            return i < seen_idx ? new int[] {i+1, seen_idx+1} : new int[] {seen_idx+1, i+1};
        } else {
            seen.put(curr_num, i);
        }
    }
    return new int[] {};
}
