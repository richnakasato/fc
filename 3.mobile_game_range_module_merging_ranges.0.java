// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public class IntervalComparator implements Comparator<Interval> {
    @Override
    public int compare(Interval lhs, Interval rhs) {
        int left = 0;
        int right = 0;
        if (lhs.start == rhs.start) {
            left = lhs.end;
            right = rhs.end;
        } else {
            left = lhs.start;
            right = rhs.start;
        }
        return left < right ? -1 : left == right ? 0 : 1;
    }
}

public static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervalsList) {
    if (intervalsList.size() < 2) return intervalsList;
    //Collections.sort(intervalsList);
    ArrayList<Interval> results = new ArrayList<>();
    Interval curr = new Interval(intervalsList.get(0).start, intervalsList.get(0).end);
    for (int i=1; i<intervalsList.size(); i++) {
        if (curr.end >= intervalsList.get(i).start) {
            curr.end = curr.end < intervalsList.get(i).end ? intervalsList.get(i).end : curr.end;
        } else {
            results.add(curr);
            curr = new Interval(intervalsList.get(i).start, intervalsList.get(i).end);
        }
    }
    results.add(curr);
    return results;
}
