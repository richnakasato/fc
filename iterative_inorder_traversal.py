class BinaryTree:

    def __init__(self, root_data):
        self.data = root_data
        self.left_child = None
        self.right_child = None

    def inorder_iterative(self):
        inorder_list = []
        stack = list()
        done = False
        curr = self
        while not done:
            if curr:
                stack.append(curr)
                curr = curr.get_left_child()
            else:
                if len(stack):
                    curr = stack.pop()
                    inorder_list.append(curr.get_root_val())
                    curr = curr.get_right_child()
                else:
                    done = True
        return inorder_list

    def get_right_child(self):
        return self.right_child

    def get_left_child(self):
        return self.left_child

    def set_root_val(self, obj):
        self.data = obj

    def get_root_val(self):
        return self.data
