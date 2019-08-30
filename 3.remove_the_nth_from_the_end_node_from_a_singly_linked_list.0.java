// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode removeNthFromEnd(ListNode head, int n) {
    if (head == null || n < 1) return null;
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode fast = dummy, slow = dummy;
    int counter = 0;
    while (fast.next != null) {
        fast = fast.next;
        if (counter == n) {
            slow = slow.next;
        } else {
            counter += 1;
        }
    }
    if (counter == n && slow.next != null) {
        slow.next = slow.next.next;
    }
    return dummy.next;
}
