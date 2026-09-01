class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        frq = {}
        max_frq = 0
        res = 0

        l = 0
        for r in range(len(s)):
            char = s[r]
            frq[char] = frq.get(char, 0) + 1
            max_frq = max(max_frq, frq[char])

            while (r - l + 1) - max_frq > k:
                frq[s[l]] -= 1
                l += 1

            res = max(res, r - l + 1)

        return res 

