// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public static boolean lessThan(Interval lhs, Interval rhs) {
    if (lhs.start < rhs.start) return true;
    else {
        if (lhs.start == rhs.start) {
            if (lhs.end < rhs.end) {
                return true;
            }
        }
    }
    return false;
}

public static ArrayList<Interval> insertRange(ArrayList<Interval> intervalsList, Interval insert) {
    ArrayList<Interval> result = new ArrayList<>();
    if (intervalsList == null || intervalsList.isEmpty()) {
        result.add(insert);
        return result;
    }
    ArrayList<Interval> intervals = new ArrayList<>();
    int idx = 0;
    Interval lhs = intervalsList.get(idx);
    Interval rhs = insert;
    while (lhs != null && rhs != null) {
        if (lessThan(lhs, rhs)) {
            intervals.add(lhs);
            idx += 1;
            lhs = idx < intervalsList.size() 
                      ? intervalsList.get(idx) 
                      : null;
        }
        else {
            intervals.add(rhs);
            rhs = null;
        }
    }
    while (lhs != null) {
        intervals.add(lhs);
        idx += 1;
        lhs = idx < intervalsList.size() 
                  ? intervalsList.get(idx) 
                  : null;
    }
    while (rhs != null) {
        intervals.add(rhs);
        rhs = null;
    }
    Interval curr = intervals.get(0);
    for (int i=1; i<intervals.size(); i++) {
        if (curr.end >= intervals.get(i).start) {
            curr.end = Math.max(curr.end, intervals.get(i).end);
        } else {
            result.add(curr);
            curr = intervals.get(i);
        }
    }
    result.add(curr);
    return result;
}
