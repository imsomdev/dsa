class Solution:
    def missingMultiple(self, nums: List[int], k: int) -> int:
        res = 0

        i = k

        while True:
            if i not in nums:
                return i
            
            i += k
        
        return i
                