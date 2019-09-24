// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public Boolean isCyclic(ListNode head) {
    if (head == null) return false;
    if (head == head.next) return true;
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode fast = dummy;
    ListNode slow = dummy;
    while (slow != null && fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) return true;
    }
    return false;
}
