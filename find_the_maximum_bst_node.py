class BinaryTree:
    
    def __init__(self, root_node = None):
        # Check out Use Me section to find out Node Structure
        self.root = root_node
    
    def find_max(self, root):
        # Return element should be of type TreeNode
        if not root:
            return root
        else:
            curr = root
            while curr.right_child:
                curr = curr.right_child
            return curr


def main():
    pass

if __name__ == "__main__":
    main()

