// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void helper(String digits, int idx, ArrayList<String> keypad, 
                          StringBuilder curr, ArrayList<String> results) {
    if (digits.length() == idx) {
        results.add(curr.toString());
        return;
    }
    int digit = Character.getNumericValue(digits.charAt(idx));
    for (int i=0; i<keypad.get(digit).length(); i++) {
        curr.append(keypad.get(digit).charAt(i));
        helper(digits, idx+1, keypad, curr, results);
        curr.setLength(curr.length() - 1);
    }
    return;
}

public static ArrayList<String> getStringsFromNums(String digits) {
    ArrayList<String> results = new ArrayList<>();
    if (digits.length() == 0) return results;
    ArrayList<String> keypad = new ArrayList<>();
    keypad.add("");
    keypad.add("");
    keypad.add("abc");
    keypad.add("def");
    keypad.add("ghi");
    keypad.add("jkl");
    keypad.add("mno");
    keypad.add("pqrs");
    keypad.add("tuv");
    keypad.add("wxyz");
    helper(digits, 0, keypad, new StringBuilder(), results);
    return results;
}
