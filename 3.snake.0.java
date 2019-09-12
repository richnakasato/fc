// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public static ArrayList<Integer> findSpiral(int[][] arr) {
    ArrayList<Integer> result = new ArrayList<>();
    if (arr.length == 0) return result;
    int dir = 0;
    int top = 0, rhs = arr[0].length, bot = arr.length, lhs = 0;
    while (top < bot && lhs < rhs) {
        if (dir == 0) {
            for (int i=lhs; i<rhs; i++) {
                result.add(arr[top][i]);
            }
            top += 1;
        } else if (dir == 1) {
            for (int i=top; i<bot; i++) {
                result.add(arr[i][rhs - 1]);
            }
            rhs -= 1;
        } else if (dir == 2) {
            for (int i=rhs - 1; i>=lhs; i--) {
                result.add(arr[bot - 1][i]);
            }
            bot -= 1;
        } else {
            for (int i=bot - 1; i>=top; i--) {
                result.add(arr[i][lhs]);
            }
            lhs += 1;
        }
        dir = (dir + 1) % 4;
    }
    return result;
}
