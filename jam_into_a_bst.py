class BinaryTree:

    def __init__(self, root_node = None):
        # Check out Use Me section to find out Node Structure
        self.root = root_node

    def insert(self, root, data):
        # Return the new root
        root = self._insert(root, data)
        return root

    def _insert(self, curr, data):
        if not curr:
            return TreeNode(data, None, None)
        else:
            if data < curr.data:
                curr.left_child = self._insert(curr.left_child, data)
            elif data > curr.data:
                curr.right_child = self._insert(curr.right_child, data)
            return curr
