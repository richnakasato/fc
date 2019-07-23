// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static ArrayList<String> removeDuplicates(List<String> input) {
    if (input == null) return new ArrayList<String>();
    ArrayList<String> results = new ArrayList<>();
    SortedSet<String> memo = new TreeSet<>();
    for (String str : input) {
        memo.add(str);
    }
    for (String s : memo) {
        results.add(s);
    }
    return results;
}
