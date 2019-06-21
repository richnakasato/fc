// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtTail(ListNode head) {
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode curr = dummy;
    while (curr.next != null) {
        if (curr.next.next == null) {
            curr.next = null;
            break;
        } else {
            curr = curr.next;
        }
    }
    return dummy.next;
}
