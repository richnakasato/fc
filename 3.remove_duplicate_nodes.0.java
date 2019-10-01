// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode removeDuplicates(ListNode head) {
    if (head == null) return head;
    Set<Integer> seen = new HashSet<>();
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode trav = dummy;
    while (trav != null && trav.next != null) {
        if (seen.contains(trav.next.data)) {
            trav.next = trav.next.next;
        } else {
            seen.add(trav.next.data);
        }
        trav = trav.next;
    }
    return dummy.next;
}
