// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode reverseList(ListNode head) {
    if (head == null) return null;
    ListNode prev = null;
    ListNode curr = head;
    ListNode temp;
    while (curr != null) {
        temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
    }
    return prev;
}
