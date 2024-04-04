class Solution:
    def maxDepth(self, s: str) -> int:
        count = 0
        stk = []
        for c in s:
            if c == '(':
                stk.append(c)
            if c == ')' and len(stk) > 0:
                stk.pop()
            count = max(count, len(stk))
            
        return count
                
                