// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtTail(ListNode head) {
    if (head == null || head.next == head) return null;
    ListNode curr = head;
    boolean done = false;
    while (!done) {
        if (curr.next == head) {
            curr.data = head.data;
            curr.next = head.next;
            done = true;
        } else {
            curr = curr.next;
        }
    }
    return curr;
}
