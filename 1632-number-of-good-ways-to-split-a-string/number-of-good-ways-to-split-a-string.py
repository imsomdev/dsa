class Solution:
    def numSplits(self, s: str) -> int:
        count = 0
        charcount = 0
        seen = set()
        countlist = []

        for c in s:
            if c not in seen:
                charcount += 1
                seen.add(c)
            countlist.append(charcount)

        seen2 = set()
        charcount2 = 0
        
        for i in range(len(s) - 1, -1, -1):
            if s[i] not in seen2:
                charcount2 += 1
                seen2.add(s[i])
                
            if charcount2 == countlist[i-1]:
                count += 1

        return count - 1