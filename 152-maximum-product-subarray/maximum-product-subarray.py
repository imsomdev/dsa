class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        pre = 1
        suf = 1
        res = float("-inf")
        n = len(nums)

        for i in range(n):
            if pre == 0:
                pre = 1
            if suf == 0:
                suf = 1
            
            pre *= nums[i]
            suf *= nums[n - 1 - i]
            res = max(res, pre, suf)
        
        return res