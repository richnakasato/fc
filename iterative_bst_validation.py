# Collections module has already been imported.
class BinaryTree:
    def __init__(self, root_node = None):
            self.root = root_node


    def validate_BST_Itr(self, root):
        # Return type should be Boolean
        if root:
            q = deque()
            lower = float('-inf')
            upper = float('inf')
            curr = (lower, root, upper)
            q.append(curr)
            while len(q):
                lower, curr, upper = q.popleft()
                if not lower < curr.data < upper:
                    return False
                else:
                    if curr.left_child:
                        left = (lower, curr.left_child, curr.data)
                        q.append(left)
                    if curr.right_child:
                        right = (curr.data, curr.right_child, upper)
                        q.append(right)
        return True
