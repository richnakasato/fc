// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int minTriangleDepth(ArrayList<ArrayList<Integer>> input) {
    if (input.size() == 0 || input.get(0).size() == 0) return 0;
    if (input.size() == 1 && input.get(0).size() == 1) return input.get(0).get(0);
    ArrayList<ArrayList<Integer>> sums = new ArrayList<>();
    for (int i=0; i<input.size(); i++) {
        sums.add(new ArrayList<Integer>());
        for (int j=0; j<input.get(i).size(); j++) {
            sums.get(i).add(0);
        }
        if (i == 0) {
            sums.get(i).set(0, input.get(i).get(0));
        } else {
            sums.get(i).set(0, 
                            sums.get(i-1).get(0) 
                            + input.get(i).get(0));
            sums.get(i).set(input.get(i).size()-1,
                            sums.get(i-1).get(input.get(i-1).size()-1)
                            + input.get(i).get(input.get(i).size()-1));
            for (int j=1; j<input.get(i).size()-1; j++) {
                int lhs = sums.get(i-1).get(j-1);
                int rhs = sums.get(i-1).get(j);
                int curr = input.get(i).get(j);
                sums.get(i).set(j, Math.min(lhs, rhs)+curr);
            }
        }
    }
    int bot = input.get(input.size() - 1).size() - 1;
    int min = Integer.MAX_VALUE;
    for (int i=0; i<bot; i++) {
        min = Math.min(min, sums.get(bot).get(i));
    }
    return min;
}
