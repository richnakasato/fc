from collections import deque

class Node():

    def __init__(self, data=None):
        self.data = data
        self.left = None
        self.right = None


def min_node(node):
    min_ = None
    if node:
        curr = node
        while curr.left:
            curr = curr.left
        min_ = curr
    return min_


def delete_node(root, data):
    if not root:
        return
    else:
        if data < root.data:
            root.left = delete_node(root.left, data)
        elif data > root.data:
            root.right = delete_node(root.right, data)
        else:
            if not root.left:
                return root.right
            elif not root.right:
                return root.left
            else:
                temp = min_node(root.right)
                root.data = temp.data
                root.right = delete_node(root.right, temp.data)
        return root


def inorder(root):
    if root:
        stack = list()
        curr = root
        done = False
        while not done:
            if curr:
                stack.append(curr)
                curr = curr.left
            else:
                if stack:
                    curr = stack.pop()
                    print(curr.data)
                    curr = curr.right
                else:
                    done = True


def levelorder(root):
    q = deque()
    q.append(root)
    while q:
        curr = q.popleft()
        print(curr.data)
        if curr.left:
            q.append(curr.left)
        if curr.right:
            q.append(curr.right)


def main():
    node_a = Node(1)
    node_b = Node(2)
    node_c = Node(3)
    node_d = Node(4)
    node_e = Node(5)
    node_f = Node(6)
    node_g = Node(7)
    root = node_d
    node_d.left = node_b
    node_b.left = node_a
    node_b.right = node_c
    node_d.right = node_f
    node_f.left = node_e
    node_f.right = node_g
    inorder(root)
    print("--")
    levelorder(root)
    print("--")
    print(min_node(node_a).data)
    print("--")
    root = delete_node(root, 4)
    inorder(root)
    print("--")
    levelorder(root)
    print("--")


if __name__ == "__main__":
    main()

