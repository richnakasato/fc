// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode insertAtTail(ListNode head, int data) {
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode curr = dummy;
    while (curr.next != null) {
        curr = curr.next;
    }
    curr.next = new ListNode(data);
    return dummy.next;
}
