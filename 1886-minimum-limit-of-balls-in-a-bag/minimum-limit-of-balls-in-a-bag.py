class Solution(object):
    def minimumSize(self, nums, maxOperations):
        """
        :type nums: List[int]
        :type maxOperations: int
        :rtype: int
        """
        lo = 1
        ans = max(nums)
        hi = ans
        while(lo <= hi):
            mid = (lo + hi) // 2
            ops = 0
            for n in nums:
                if n > mid:
                    ops += (n-1) // mid   # this is for ceiling calculation, like 10 ko 3 penalty se divide kaiya to 4 ayeha 3 nehi
            if ops <= maxOperations:
                ans = mid
                hi = mid - 1 
            else:
                lo = mid + 1
        
        return ans
        