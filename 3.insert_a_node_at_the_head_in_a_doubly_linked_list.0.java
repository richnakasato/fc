// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public DoublyLinkedNode insertAtHead(DoublyLinkedNode head, int data) {
    DoublyLinkedNode newNode = new DoublyLinkedNode(data);
    if (head == null) return newNode;
    newNode.next = head;
    head.prev = newNode;
    return newNode;
}
