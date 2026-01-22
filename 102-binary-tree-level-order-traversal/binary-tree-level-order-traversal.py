# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def levelOrder(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[List[int]]
        """
        if not root:
            return []

        q =[]
        res = []
        q.append(root)
        
        while q:
            q_len = len(q)
            temp = []

            for i in range(q_len):
                item = q.pop(0)
                temp.append(item.val)
                if item.left:
                    q.append(item.left)
                if item.right:
                    q.append( item.right)
            res.append(temp)

        return res