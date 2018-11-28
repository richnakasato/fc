from collections import deque

class BinaryTree:

    class TreeNode:

        def __init__(self, data, left=None, right=None):
            self.data = data
            self.left = left
            self.right = right


    def __init__(self, root=None):
        self.root = root

    def preorder(self, curr):
        if curr:
            print(str(curr.data) + ' ')
        if curr.left:
            self.preorder(curr.left)
        if curr.right:
            self.preorder(curr.right)

    def number_of_leaves(self, root):
        q = deque()
        leaf_count = 0
        if root:
            q.append(root)
        while len(q) != 0:
            curr = q.popleft()
            if not curr.left and not curr.right:
                leaf_count += 1
            if curr.left:
                q.append(curr.left)
            if curr.right:
                q.append(curr.right)
        return leaf_count


def main():
    root = BinaryTree.TreeNode(1)
    bt = BinaryTree(root)
    bt.root.left = BinaryTree.TreeNode(2)
    bt.root.right = BinaryTree.TreeNode(3)
    bt.root.left.left = BinaryTree.TreeNode(4)
    bt.root.left.right = BinaryTree.TreeNode(5)
    bt.root.right.left = BinaryTree.TreeNode(6)
    bt.root.right.right = BinaryTree.TreeNode(7)
    bt.root.left.left.left = BinaryTree.TreeNode(8)
    bt.root.left.left.right = BinaryTree.TreeNode(9)
    print('leaves: {}'.format(str(bt.number_of_leaves(bt.root))))
    bt.preorder(bt.root)


if __name__ == "__main__":
    main()

