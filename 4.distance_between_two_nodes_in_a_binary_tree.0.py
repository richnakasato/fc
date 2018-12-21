from collections import deque

class Tree():

    class Node():

        def __init__(self, data=None):
            self.data = data
            self.left_child = None
            self.right_child = None

    def __init__(self, root=None):
        self.root = root

    def helper(self):
        parents = dict()
        if self.root:
            q = deque()
            q.append((self.root, None))
            while len(q):
                child, parent = q.popleft()
                parents[child.data] = parent
                if child.left_child:
                    q.append((child.left_child, child.data))
                if child.right_child:
                    q.append((child.right_child, child.data))
        return parents

    def get_node_distance(self, root, node_data1, node_data2):
        distance = 0
        if self.root:
            parents = self.helper()
            node1_to_root = set()
            node2_to_root = set()
            done = False
            while not done:
                if not node_data1 and not node_data2:
                    done = True
                else:
                    if node_data1:
                        node1_to_root.add(node_data1)
                        node_data1 = parents[node_data1]
                    if node_data2:
                        node2_to_root.add(node_data2)
                        node_data2 = parents[node_data2]
            distance = len(node1_to_root ^ node2_to_root)
        return distance


def main():
    one = Tree.Node(1)
    two = Tree.Node(2)
    three = Tree.Node(3)
    four = Tree.Node(4)
    five = Tree.Node(5)
    one.left_child = two
    one.right_child = three
    two.right_child = four
    three.right_child = five
    bt = Tree(one)
    print(bt.get_node_distance(None, two.data, five.data))


if __name__ == "__main__":
    main()

