# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isBalanced(self, root: TreeNode | None) -> bool:

        def helper(node):
            if node is None:
                return 0, True

            left_height, left_balanced = helper(node.left)
            right_height, right_balanced = helper(node.right)

            height = max(left_height, right_height) + 1

            balanced = (
                left_balanced
                and right_balanced
                and abs(left_height - right_height) <= 1
            )

            return height, balanced

        height, balanced = helper(root)

        return balanced