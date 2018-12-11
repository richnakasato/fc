from collections import deque

class SinglyLinkedList:
    #constructor
    def __init__(self):
        self.head = None

    #method for setting the head of the Linked List
    def setHead(self,head):
        self.head = head

    def arrange_in_pairs(self):
        if self.head:
            queue = deque()
            stack = list()
            curr = self.head
            while curr:
                queue.append(curr)
                stack.append(curr)
                curr = curr.next
            count = len(queue)
            while count:
                curr = queue.popleft()
                if len(stack):
                    new_next = stack.pop()
                    new_next.next = curr.next
                    curr.next = new_next
                count//=2
            curr.next = None
