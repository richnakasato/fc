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
            a_parents, a_curr = set(), A
            b_parents, b_curr = set(), B
            done = False
            while not done:
                if not a_curr and not b_curr:
                    done = True
                elif a_curr in b_parents or b_curr in a_parents:
                    print(a_parents)
                    print(b_parents)
                    result = len(a_parents) + len(b_parents)
                    done = True
                else:
                    a_curr = parents[a_curr]
                    b_curr = parents[b_curr]
                    if a_curr:
                        a_parents.add(a_curr)
                    if b_curr:
                        b_parents.add(b_curr)
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
    print(bt.distance(two.data, five.data))


if __name__ == "__main__":
    main()

