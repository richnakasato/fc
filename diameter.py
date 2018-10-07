class BinaryTree:
    def __init__(self, root_node = None):
        self.root = root_node

    def diameter(self, root):
        max_dia = 0
        if root:
            long_len, max_dia = self._diameter_helper(root)
        return max_dia

    def _diameter_helper(self, root):
        if not root:
            return 0, 0
        else:
            left_len, left_dia = self._diameter_helper(root.left_child)
            right_len, right_dia = self._diameter_helper(root.right_child)
            cur_len = 1 + max(left_len, right_len)
            cur_dia = 1 + left_len + right_len
            return cur_len, max(cur_dia, left_dia, right_dia)
