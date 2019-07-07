// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtMiddle(ListNode head, int position) {
    if (head == null || position == 0) return null;
    int count = 1;
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode curr = dummy;
    while (curr.next != null) {
        if (count == position) {
            curr.next = curr.next.next;
            break;
        }
        curr = curr.next;
        count += 1;
    }
    return dummy.next;
}
