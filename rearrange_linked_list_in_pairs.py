class Node():

    def __init__(self, data):
        self.data = data
        self.next = None

def print_list(head):
    curr = head
    while curr:
        print('{}->'.format(curr.data), end='')
        curr = curr.next
    print('NULL')

def arrange_in_pairs(head):
    if not head:
        return
    else:
        stack = list()
        curr = head
        while curr:
            stack.append(curr.data)
            curr = curr.next
        if len(stack) < 3:
            return
        else:
            count = 0
            last = 1
            curr = head
            while curr:
                if count%2:
                    curr.data = last
                else:
                    last = curr.data
                    curr.data = stack.pop()
                count+=1
                curr = curr.next
            return


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
    arrange_in_pairs(head)
    print_list(head)


if __name__ == "__main__":
    main()

