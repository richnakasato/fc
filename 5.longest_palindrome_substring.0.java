// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public String longestPalSubstr(String str) {
    if (str.length() < 2) return str;
    int gaps = (str.length() - 2) + (str.length() - 1);
    char[] strArray = str.toCharArray();
    int len_max = 0;
    int lhs_max = 0;
    int rhs_max = 0;
    for (int i=0; i<gaps; i++) {
        int lhs = i/2;
        int rhs = i/2;
        if (i%2 == 0) rhs+=1;
        else rhs+=2;
        while (0 <= lhs && rhs < str.length() && strArray[lhs] == strArray[rhs]) {
            int len_curr = rhs - lhs;
            len_max = Math.max(len_max, len_curr);
            if (len_max == len_curr) {
                lhs_max = lhs;
                rhs_max = rhs;
            }
            lhs--;
            rhs++;
        }
    }
    return str.substring(lhs_max, rhs_max + 1);
}
