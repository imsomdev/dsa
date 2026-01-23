# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def solve(self, node):
        if not node:
            return 0,0,0

        l_st_n, l_st_val, l_res = self.solve(node.left)
        r_st_n, r_st_val, r_res = self.solve(node.right)

        total_value = l_st_val + r_st_val + node.val
        total_st = l_st_n + r_st_n + 1
        avg = total_value // total_st
        res = l_res + r_res
        if avg == node.val:
            res += 1
        return total_st, total_value, res

    def averageOfSubtree(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        _, _, res = self.solve(root)
        return res