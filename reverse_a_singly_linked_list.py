class SinglyLinkedList:
    #constructor
    def __init__(self):
        self.head = None

    #method for setting the head of the Linked List
    def setHead(self, head):
        self.head = head

    def reverse(self):
        dummy = Node()
        dummy.setNext(self.head)
        curr = dummy.getNext()
        prev = None
        while curr.next:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        curr.next = prev
        self.setHead(curr)
