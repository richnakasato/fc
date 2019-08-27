// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode findNthNodeFromEnd(ListNode head, int n) {
    if (head == null || n < 1) return null;
    ListNode fast = new ListNode(-1);
    fast.next = head;
    ListNode slow = fast;
    int count = 1;
    while (fast.next != null) {
        fast = fast.next;
        if (count < n) {
            count += 1;
        } else {
            slow = slow.next;
        }
    }
    return count == n ? slow : null;
}
