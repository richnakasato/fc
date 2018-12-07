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
        # Return element should be of Type TreeNode
        if not self.root:
            return self.root
        stack = list()
        done = False
        count = 0
        curr = self.root
        while not done:
            if curr:
                stack.append(curr)
                curr = curr.left_child
            else:
                if len(stack):
                    curr = stack.pop()
                    count += 1
                    if count == k:
                        break
                    curr = curr.right_child
                else:
                    curr = None
                    done = True
        return curr
