class BinaryTree:
    def __init__(self, root_node = None):
            self.root = root_node

    # All the necessary collection modules have been already imported.
    def max_sum_path(self, root):
        max_sum = 0
        if root:
            max_sum = self.max_sum_path_helper(root)
        return max_sum

    def max_sum_path_helper(self, root):
        if not root:
            return 0, 0
        else:
            left_max, max_sum = self.max_sum_path_helper(root.left_child)
            right_max, max_sum = self.max_sum_path_helper(root.right_child)
            my_max = root.data + left_max + right_max
            max_sum = max(my_max, max_sum)
            if root == self.root:
                return max_sum
            else:
                return root.data + max(left_max, right_max), max_sum
