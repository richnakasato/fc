// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode insertAtPosition(ListNode head, int data, int pos) {
    if (pos < 0) return head;
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode curr = dummy;
    int count = 0;
    while (curr.next != null) {
        count += 1;
        if (pos == count) {
            break;
        }
        curr = curr.next;
    }
    ListNode temp = new ListNode(data);
    if (pos == count) {
        temp.next = curr.next;
        curr.next = temp;
    } else {
        curr.next = temp;
    }
    return dummy.next;
}
