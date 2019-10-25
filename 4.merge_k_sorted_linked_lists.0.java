// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public class CustomComparator implements Comparator<ListNode> {
    public int compare(ListNode lhs, ListNode rhs) {
        if (lhs.data < rhs.data) return -1;
        else if (lhs.data > rhs.data) return 1;
        else return 0;
    }
}

public ListNode mergeKLists(ArrayList<ListNode> lists) {
    if (lists.isEmpty()) return null;
    if (lists.size() == 1) return lists.get(0);
    PriorityQueue<ListNode> pq = new PriorityQueue<>(new CustomComparator());
    ListNode dummy = new ListNode(-1);
    ListNode curr = dummy;
    for (int i=0; i<lists.size(); i++) {
        pq.add(lists.get(i));
    }
    while (pq.size() > 0) {
        ListNode temp = pq.poll();
        curr.next = temp;
        curr = curr.next;
        if (curr.next != null) {
            pq.add(curr.next);
        }
    }
    return dummy.next;
}
