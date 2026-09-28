class Solution:
    def maxDepth(self, s: str) -> int:
        st = []
        depth = 0
        for c in s:
            if c == "(":
                st.append(c)
                depth = max(depth, len(st))
            elif c ==")":
                st.pop()

        return depth