// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static ArrayList<ArrayList<Integer>> generatePascalTriangle(int numRows) {
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    if (numRows == 0) return result;
    for (int i=0; i<numRows; i++) {
        ArrayList<Integer> row = new ArrayList<>();
        for (int j=0; j<i+1; j++) {
            if (j == 0 || j == i) {
                row.add(1);
            }
            else {
                int left = result.get(i-1).get(j-1);
                int up = result.get(i-2).get(j-1);
                row.add(left + up);
            }
        }
        result.add(row);
    }
    return result;
}
