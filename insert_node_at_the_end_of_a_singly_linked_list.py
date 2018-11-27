class SinglyLinkedList:
    #constructor
    def __init__(self):
        self.head = None

    #method for setting the head of the Linked List
    def setHead(self, head):
        self.head = head

    # Method for inserting a new node at the start of a Linked List
    def insert_at_end(self, data):
        temp = Node()
        temp.setData(data)
        if not self.head:
            self.head = temp
        else:
            curr = self.head
            while curr.next:
                curr = curr.next
            curr.next = temp
