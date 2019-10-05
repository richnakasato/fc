// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode reverseInPairs(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode a = dummy;
    ListNode b = head;
    ListNode c;
    ListNode d;
    while (a != null && b != null) {
        c = b.next;
        if (c != null) d = c.next;
        else break;
        a.next = c;
        c.next = b;
        b.next = d;
        a = b;
        b = d;
    }
    return dummy.next;
}
