lass SinglyLinkedList:
    #constructor
    def __init__(self):
        self.head = None

    #method for setting the head of the Linked List
    def setHead(self, head):
        self.head = head

    #method for deleting a node having a certain data
    def delete(self, data):
        dummy = Node()
        dummy.setNext(self.head)
        curr = dummy
        while curr.getNext():
            if curr.getNext().getData() == data:
                curr.setNext(curr.getNext().getNext())
                break
            curr = curr.getNext()
        self.head = dummy.getNext()
