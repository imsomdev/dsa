class Solution:
    def rearrangeCharacters(self, s: str, target: str) -> int:
        tc = Counter(target)
        sc = Counter(s)

        minc = float("inf")

        for c in tc.items():
            char = c[0]
            if tc[char] <= sc[char]:

                minc = min(minc, sc[char] // tc[char])
            else:
                return 0
            
        return minc