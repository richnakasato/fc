from collections import deque

class Tree():

    class Node():

        def __init__(self, data=None):
            self.data = data
            self.left = None
            self.right = None

    def __init__(self, root=None):
        self.root = root

    def parent_helper(self):
        parents = dict()
        queue = deque()
        queue.append((self.root, None))
        while len(queue):
            curr, parent = queue.popleft()
            parents[curr.data] = parent
            if curr.left:
                queue.append((curr.left, curr.data))
            if curr.right:
                queue.append((curr.right, curr.data))
        return parents

    def distance(self, A, B):
        result = 0
        if self.root:
            parents = self.parent_helper()
            A_parents = set()
            done = False
            parent = A.data
            while not done:
                parent = parents[parent]
                if not parent:
                    done = True
                else:
                    result+=1
                    A_parents.add(parent)
            done = False
            parent = B.data
            while not done:
                parent = parents[parent]
                if not parent:
                    done = True
                else:
                    result+=1
                    if parent in A_parents:
                        done = True
        return result


def main():
    one = Tree.Node(1)
    two = Tree.Node(2)
    three = Tree.Node(3)
    four = Tree.Node(4)
    five = Tree.Node(5)
    one.left = two
    one.right = three
    two.right = four
    three.right = five
    bt = Tree(one)
    print(bt.distance(two, five))


if __name__ == "__main__":
    main()

