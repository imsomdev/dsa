class Solution(object):
    def isEqual(self, p, q):
        if not p and not q:
            return True
        if not p or not q or p.val != q.val:
            return False
        return self.isEqual(p.left, q.left) and self.isEqual(p.right, q.right)

    def isSubtree(self, root, subRoot):
        if not root:
            return False
        if self.isEqual(root, subRoot):
            return True
        
        return self.isSubtree(root.left, subRoot) or self.isSubtree(root.right, subRoot)