class BinaryTree:

    def __init__(self, root_node = None):
        # Check out Use Me section to find out Node Structure
        self.root = root_node

    def find_min(self, root):
        # Return element should be of type TreeNode
        if not root:
            return None
        else:
            stack = list()
            curr = root
            done = False
            while not done:
                if curr:
                    stack.append(curr)
                    curr = curr.left_child
                else:
                    if len(stack):
                        curr = stack.pop()
                        return curr
                    else:
                        done = True
            return None

