class SinglyLinkedList:

    def __init__(self):
        self.head = None

    def setHead(self, head):
        self.head = head

    def is_list_even(self):
        is_even = True
        if self.head:
            is_even = not is_even
            curr = self.head
            while curr.next:
                is_even = not is_even
                curr = curr.next
        return is_even

