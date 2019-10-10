// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean isBalanced(String input) {
    if (input.length() == 0) return true;
    if (input.length() < 2) return false;
    HashMap<String, String> map = new HashMap<>();
    map.put("(",")");
    map.put("[","]");
    map.put("{","}");
    Stack<String> stack = new Stack<>();
    for (int i=0; i<input.length(); i++) {
        String curr = String.valueOf(input.charAt(i));
        if (map.containsKey(curr)) {
            stack.push(map.get(curr));
        } else {
            if (stack.isEmpty() || !stack.pop().equals(curr)) {
                return false;
            }
        }
    }
    return stack.isEmpty();
}
