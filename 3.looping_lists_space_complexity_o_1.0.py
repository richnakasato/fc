class SinglyLinkedList:
    #constructor
    def __init__(self):
        self.head = None

    #method for setting the head of the Linked List
    def setHead(self, head):
        self.head = head

    def is_cyclic(self):
        if not self.head:
            return False
        fast = self.head
        slow = self.head
        while slow.next and fast.next and fast.next.next:
            if slow == fast.next:
                return True
            slow = slow.next
            fast = fast.next.next
        return False
