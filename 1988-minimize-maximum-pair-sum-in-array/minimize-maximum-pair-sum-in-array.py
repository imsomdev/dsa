class Solution(object):
    def minPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        res = -1
        l = 0
        r = len(nums) - 1
        while(l < r):
            if nums[l] + nums[r] > res:
                res = nums[l] + nums[r]
            l += 1
            r -= 1
        return res