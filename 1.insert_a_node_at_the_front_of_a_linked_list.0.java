// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode insertAtHead(ListNode head, int data) {
    ListNode new_head = new ListNode(data);
    new_head.next = head;
    return new_head;
}
