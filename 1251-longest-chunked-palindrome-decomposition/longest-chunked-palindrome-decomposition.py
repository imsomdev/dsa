class Solution:
    def longestDecomposition(self, text: str) -> int:
        res = 0

        fwstart = 0
        fwend = 0

        bwstart = len(text) - 1
        bwend = len(text) - 1

        while fwend < bwstart:
            if text[fwstart:fwend+1] == text[bwstart:bwend+1]:
                res += 2

                fwend += 1
                fwstart = fwend

                bwstart -= 1
                bwend = bwstart
            else:
                fwend += 1
                bwstart -= 1

        if bwend - fwstart >= 0:
            res += 1
        
        return res
