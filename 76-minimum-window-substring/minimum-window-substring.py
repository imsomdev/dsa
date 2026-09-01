from collections import Counter

class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if not t:
            return ""

        tmap = Counter(t)
        smap = {}
        formed = 0
        required = len(tmap)
        l =0

        min_len = float("inf")
        min_l = 0
        min_r = 0
        n = len(s)

        for r in range(n):
            char = s[r]

            if char in tmap:
                smap[char] = smap.get(char, 0) + 1

                if smap[char] == tmap[char]:
                    formed += 1

            while formed == required:
                if r - l + 1 < min_len:
                    min_len = r - l + 1
                    min_l = l
                    min_r = r

                char = s[l]
                
                if char in tmap:
                    smap[char] -= 1

                    if smap[char] < tmap[char]:
                        formed -= 1
                
                l += 1
            
        if min_len == float("inf"):
            return ""
        
        return s[min_l:min_r+1]

            
