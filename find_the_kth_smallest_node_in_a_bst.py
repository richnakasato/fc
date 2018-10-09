class BinaryTree:

    def __init__(self, root_node = None):
        # Check out Use Me section to find out Node Structure
        self.root = root_node

    # Helper Method
    def size(self, root):
        if root == None:
            return 0
        else:
            return (self.size(root.left_child) + 1 + self.size(root.right_child))

    def find_kth_smallest(self, root, k):
        if k > self.size(root):
            return None
        # Return element should be of Type TreeNode
        stack = list()
        count = 0
        curr = root
        done = False
        while not done:
            if curr:
                stack.append(curr)
                curr = curr.left_child
            else:
                if len(stack):
                    curr = stack.pop()
                    count += 1
                    if count == k:
                        return curr
                    curr = curr.right_child
                else:
                    done = True
        return None
