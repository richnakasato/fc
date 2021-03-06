from collections import deque

class Node():

    def __init__(self, data):
        self.data = data
        self.next = None

def print_list(head):
    curr = head
    while curr:
        print('{}->'.format(curr.data))
        curr = curr.next
    print('NULL')

def get_size(head):
    count = 0
    curr = head
    while curr:
        count+=1
        curr = curr.next
    return count

def arrange_in_pairs_bf(head):
    size = get_size(head)
    mid = size//2
    count = 0
    stack = list()
    queue = deque()
    curr = head
    while curr:
        if count < mid:
            queue.append(curr.data)
        elif count == mid:
            queue.append(curr.data)
            stack.append(curr.data)
        else:
            stack.append(curr.data)
        count+=1
        curr = curr.next
    count = 0
    curr = head
    while curr:
        if not count%2:
            curr.data = queue.popleft()
        else:
            curr.data = stack.pop()
        count+=1
        curr = curr.next

def arrange_in_pairs_fs(head):
    if not head or not head.next:
        return
    stack = list()
    queue = deque()
    fast = head
    slow = head
    while fast and fast.next and fast.next.next:
        queue.append(slow.data)
        slow = slow.next
        fast = fast.next.next
    queue.append(slow.data)
    while slow:
        stack.append(slow.data)
        slow = slow.next
    slow = head
    count = 0
    while slow:
        if not count%2:
            slow.data = queue.popleft()
        else:
            slow.data = stack.pop()
        count+=1
        slow = slow.next


def main():
    n1 = Node(1)
    n2 = Node(2)
    n3 = Node(3)
    n4 = Node(4)
    n5 = Node(5)
    head = n1
    n1.next = n2
    n2.next = n3
    n3.next = n4
    n4.next = n5
    print_list(head)
    #arrange_in_pairs_bf(head)
    arrange_in_pairs_fs(head)
    print_list(head)


if __name__ == "__main__":
    main()

