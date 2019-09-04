// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public DoublyLinkedNode insertAtPos(DoublyLinkedNode head, int data, int pos) {
    if (pos < 1) return head;
    DoublyLinkedNode newNode = new DoublyLinkedNode(data);
    DoublyLinkedNode prev = null;
    DoublyLinkedNode curr = head;
    int count = 1;
    while (curr != null && count < pos) {
        prev = curr;
        curr = curr.next;
        count += 1;
    }
    if (count == pos) {
        if (prev != null) {
            newNode.prev = prev;
            prev.next = newNode;
        }
        if (curr != null) {
            newNode.next = curr;
            curr.prev = newNode;
        }
    }
    return pos == 1 ? newNode : head;
}
