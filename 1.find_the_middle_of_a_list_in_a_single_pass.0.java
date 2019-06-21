// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode findMiddleNode(ListNode head) {
    if (head == null) return head;
    ListNode slow = head;
    ListNode fast = head;
    while (slow.next != null && fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
