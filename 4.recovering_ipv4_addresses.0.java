// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public static boolean isValid(String numStr) {
    int num = Integer.parseInt(numStr);
    return 0 <= num && num <= 255 && numStr.length() < 4;
}

public static void helper(String s, StringBuilder octet, ArrayList<String> addr, ArrayList<String> results) {
    if (s.length() == 0) {
        if(addr.size() == 4) {
            results.add(String.join(".", addr));
        }
    } else {
        for(int i=0; i<s.length(); i++) {
            octet.append(s.charAt(i));
            if (isValid(octet.toString())) {
                addr.add(octet.toString());
                helper(s.substring(i + 1,s.length()), new StringBuilder(), addr, results);
                addr.remove(addr.size() - 1);
            } else {
                break;
            }
        }
    }
}

public static ArrayList<String> generateIPAddrs(String s) {
    if (s == null) return null;
    if (s.length() == 0) return new ArrayList<String>();
    ArrayList<String> results = new ArrayList<>();
    ArrayList<String> addr = new ArrayList<>();
    helper(s, new StringBuilder(), addr, results);
    return results;
}
