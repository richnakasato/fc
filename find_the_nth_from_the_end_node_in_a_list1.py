class SinglyLinkedList:
    #constructor
    def __init__(self):
        self.head = None

    #method for setting the head of the Linked List
    def setHead(self, head):
        self.head = head

    def find_nth_node_from_end(self, n):
        if not self.head or n == 0:
            return None
        else:
            curr_node = self.head
            target_node = self.head
            target = 0
            while curr_node and target < n:
                curr_node = curr_node.next
                target+=1
            while curr_node:
                curr_node = curr_node.next
                target_node = target_node.next
            if target == n:
                return target_node
            else:
                return None

def main():
    pass

if __name__ == "__main__":
    main()

