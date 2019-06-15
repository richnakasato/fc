// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean areAllCharactersUnique(String str){
    if (str == null) return true;
    Set<Character> seen = new HashSet<Character>();
    for (Character ch : str.toCharArray()) {
        if (seen.contains(ch)) return false;
        else seen.add(ch);
    }
    return true;
}
