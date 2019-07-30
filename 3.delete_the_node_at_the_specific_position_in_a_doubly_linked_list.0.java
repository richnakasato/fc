// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public DoublyLinkedNode deleteAtPos(DoublyLinkedNode head, int pos) {
    if (head == null || pos < 1) return null;
    DoublyLinkedNode curr = head;
    int count = 0;
    while (curr != null && count < pos) {
        ++count;
        if (count == pos) {
            if (curr.next != null) curr.next.prev = curr.prev;
            if (curr.prev != null) curr.prev.next = curr.next;
        }
        curr = curr.next;
    }
    return pos == 1 ? head.next : head;
}
