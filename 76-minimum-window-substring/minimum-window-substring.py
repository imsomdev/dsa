from collections import Counter

class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if not t:
            return ""

        t_map = Counter(t)
        s_map = {}

        required = len(t_map)
        formed = 0
        l = 0

        min_len = float("inf")
        min_l = 0
        min_r = 0

        for r in range(len(s)):
            char = s[r]

            if char in t_map:
                s_map[char] = s_map.get(char, 0) + 1

                if s_map[char] == t_map[char]:
                    formed += 1

            while formed == required:

                if r - l + 1 < min_len:
                    min_len = r - l + 1
                    min_l = l
                    min_r = r

                char = s[l]

                if char in t_map:
                    s_map[char] -= 1

                    if s_map[char] < t_map[char]:
                        formed -= 1

                l += 1

        if min_len == float("inf"):
            return ""

        return s[min_l:min_r + 1]