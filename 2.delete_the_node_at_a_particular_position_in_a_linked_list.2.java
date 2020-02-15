// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtMiddle(ListNode head, int position) {
    if (head == null || position == 0) return head;
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode search = dummy;
    int count = 1;
    while (search.next != null && count < position) {
        search = search.next;
        ++count;
    }
    if (search.next != null) {
        search.next = search.next.next;
    }
    return dummy.next;
}
