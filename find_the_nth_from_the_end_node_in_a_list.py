class SinglyLinkedList:
    #constructor
    def __init__(self):
        self.head = None

    #method for setting the head of the Linked List
    def setHead(self,head):
        self.head = head

    def find_nth_node_from_end(self, n):
        if not self.head:
            return None
        else:
            curr = self.head
            n_from_end = self.head
            count = 1
            while curr.next:
                curr = curr.next
                if count != n:
                    count +=1
                else:
                    n_from_end = n_from_end.next
            if count == n:
                return n_from_end
            else:
                return None
