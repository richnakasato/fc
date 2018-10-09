# Collections module has already been imported.
class BinaryTree:
    def __init__(self, root_node = None):
            self.root = root_node

    def validate_BST_Itr(self, root):
        stack = list()
        stack.append((float('-inf'), root, float('inf')))
        while len(stack):
            lower, curr, upper = stack.pop()
            if lower < curr.data < upper:
                if curr.left_child:
                    stack.append((lower, curr.left_child, curr.data))
                if curr.right_child:
                    stack.append((curr.data, curr.right_child, upper))
            else:
                return False
        return True
