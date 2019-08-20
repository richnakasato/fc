// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode findNthNodeFromEnd(ListNode head, int n) {
    if (head == null || n < 1) return null;
    int count = 0;
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode fast = dummy;
    ListNode slow = dummy;
    while (fast.next != null) {
        count += 1;
        fast = fast.next;
        if (count >= n) {
            slow = slow.next;
        }
    }
    return count < n ? null : slow;
}
