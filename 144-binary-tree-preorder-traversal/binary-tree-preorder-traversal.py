# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorderTraversal(self, root: TreeNode | None) -> list[int]:
        def solve(r):
            if r is None:
                return 
            
            ans.append(r.val)
            solve(r.left)
            solve(r.right)

        ans =[]
        solve(root)
        return ans