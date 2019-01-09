class SinglyLinkedList:
    #constructor
    def __init__(self):
        self.head = None

    #method for setting the head of the Linked List
    def setHead(self,head):
        self.head = head

    # Method for inserting a new node at the start of a Linked List
    def insert_at_pos(self,data,pos):
        curr = dummy = Node()
        dummy.next = self.head
        new_node = Node()
        new_node.data = data
        count = 1
        while curr.next:
            if count == pos:
                break
            curr = curr.next
            count += 1
        new_node.next = curr.next
        curr.next = new_node
        self.head = dummy.next
