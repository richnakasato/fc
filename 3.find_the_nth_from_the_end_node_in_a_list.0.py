class SinglyLinkedList:
    #constructor
    def __init__(self):
        self.head = None

    #method for setting the head of the Linked List
    def setHead(self,head):
        self.head = head

    def find_nth_node_from_end(self, n):
        # potential better way is to iterate n times, then do double
        # pointer method
        if not self.head or n == 0:
            return None
        count = 1
        dummy = Node()
        dummy.next = self.head
        curr = dummy
        nth_from_end = dummy
        while curr.next:
            curr = curr.next
            if count == n:
                nth_from_end = nth_from_end.next
            else:
                count += 1
        if count == n:
            return nth_from_end
        else:
            return None
