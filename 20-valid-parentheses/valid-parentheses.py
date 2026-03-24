class Solution:
    def isValid(self, s: str) -> bool:
        open_b = ['(', '{', '[']
        map_b = {
            ")": "(",
            "}": "{",
            "]": "["
        }
        st = []

        if len(s) % 2 != 0:
            return False
        
        for c in s:
            if c in open_b:
                st.append(c)
            else:
                if not st:
                    return False

                if map_b[c] == st[-1]:
                    st.pop()
                else:
                    return False
        return not st