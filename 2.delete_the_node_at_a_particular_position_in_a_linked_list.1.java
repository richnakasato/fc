// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtMiddle(ListNode head, int position) {
    if (head == null) return null;
    if (position == 0) return head;
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode curr = dummy;
    int count = 1;
    while (curr.next != null && count < position) {
        curr = curr.next;
        ++count;
    }
    if (curr.next != null) {
        curr.next = curr.next.next;
    }
    return dummy.next;
}
