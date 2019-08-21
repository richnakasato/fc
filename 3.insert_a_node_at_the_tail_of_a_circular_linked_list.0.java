// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode insertAtTail(ListNode head, int data) {
    ListNode newNode = new ListNode(data);
    if (head == null) {
        newNode.next = newNode;
        return newNode;
    }
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode curr = head;
    while (curr.next != dummy.next) {
        curr = curr.next;
    }
    newNode.next = curr.next;
    curr.next = newNode;
    return dummy.next;
}
