# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def insertIntoBST(self, root: TreeNode | None, val: int) -> TreeNode | None:
        if root is None:
            return TreeNode(val)
            
        node = root
        if node.left is None and val < node.val:
            node.left = TreeNode(val)
        
        if node.right is None and val > node.val:
            node.right = TreeNode(val)

        if val < node.val:
            self.insertIntoBST(node.left, val)
        
        if val > node.val:
            self.insertIntoBST(node.right, val)

        return root
