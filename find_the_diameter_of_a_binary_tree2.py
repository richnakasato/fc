class TreeNode:
    def __init__(self, data, left_child = None, right_child = None):
        self.data = data
        self.left_child = left_child
        self.right_child = right_child

class BinaryTree:
    def __init__(self, root_node = None):
            self.root = root_node

    def diameter(self, root):
        if not root:
            return 0
        else:
            height, diameter = self.helper(root)
            return max(height, diameter)

    def helper(self, root):
        if not root:
            return 0,0
        else:
            left_height, left_diameter = self.helper(root.left_child)
            right_height, right_diameter = self.helper(root.right_child)
            curr_height = 1+max(left_height,right_height)
            curr_diameter = 1+left_height+right_height
            return curr_height, max(curr_diameter, left_diameter, right_diameter)


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

