class Node:
    def __init__(self, value):
        self.left = None
        self.right = None
        self.value = value

def subtree_product(node):
    if not node:
        return 0

    left_sum = subtree_sum(node.left)
    right_sum = subtree_sum(node.right)

    return left_sum * right_sum

def subtree_sum(node):
    if not node:
        return 0

    return node.value + subtree_sum(node.left) + subtree_sum(node.right)

root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)
root.right.left = Node(6)
root.right.right = Node(7)

product = subtree_product(root)
print("Product of subtree sums:", product)
