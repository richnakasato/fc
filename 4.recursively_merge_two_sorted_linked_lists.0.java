// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode mergeTwoSortedList(ListNode l1, ListNode l2) {
    if (l1 == null) return l2;
    if (l2 == null) return l1;
    if (l1.data <= l2.data) {
        l1.next = mergeTwoSortedList(l1.next, l2);
        return l1;
    } else {
        l2.next = mergeTwoSortedList(l1, l2.next);
        return l2;
    }
}
