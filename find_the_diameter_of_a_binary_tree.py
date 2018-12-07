class TreeNode:
    def __init__(self, data, left_child = None, right_child = None):
        self.data = data
        self.left_child = left_child
        self.right_child = right_child

class BinaryTree:
    def __init__(self, root_node = None):
            self.root = root_node

    def diameter(self, root):
        if root:
            thru, rooted = self.helper(root)
            return max(thru, rooted)
        else:
            return 0

    def helper(self, root):
        if not root.left_child and not root.right_child:
            return 1, 0
        else:
            left_thru = left_rooted = 0
            if root.left_child:
                left_thru, left_rooted = self.helper(root.left_child)
            right_thru = right_rooted = 0
            if root.right_child:
                right_thru, right_rooted = self.helper(root.right_child)
            thru = 1 + max(left_thru, right_thru)
            rooted = max([1+left_thru+right_thru, left_rooted, right_rooted])
            return thru, rooted


def main():
    node1 = TreeNode(17)
    node2 = TreeNode(19)
    node3 = TreeNode(32)
    node4 = TreeNode(18, node1, node2)
    node5 = TreeNode(35, node3)
    node6 = TreeNode(14)
    node7 = TreeNode(15, node6, node4)
    node8 = TreeNode(30, None, node5)
    node9 = TreeNode(20, node7, node8)
    bt = BinaryTree(node9)
    assert bt.diameter(node9)==7

if __name__ == "__main__":
    main()

