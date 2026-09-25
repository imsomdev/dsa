from collections import Counter

class Solution:
    def removeDuplicateLetters(self, s: str) -> str:
        count = Counter(s)
        seen = set()
        st = []

        for c in s:
            count[c] -= 1

            if c in seen:
                continue

            while (
                st
                and c < st[-1]
                and count[st[-1]] > 0
            ):
                removed = st.pop()
                seen.remove(removed)

            st.append(c)
            seen.add(c)

        return "".join(st)