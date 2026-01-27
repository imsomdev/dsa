# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def pathSum(self, root, targetSum):
        """
        :type root: Optional[TreeNode]
        :type targetSum: int
        :rtype: List[List[int]]
        """
        res = []
        
        if not root:
            return []
        
        def solve(node, current_path, current_sum):
            if not node:
                return
            
            current_path.append(node.val)
            current_sum += node.val
            
            if not node.left and not node.right and current_sum == targetSum:
                res.append(list(current_path))
            
            solve(node.left, current_path, current_sum)
            solve(node.right, current_path, current_sum)
            current_path.pop()
            
        solve(root, [], 0)
        return res
        