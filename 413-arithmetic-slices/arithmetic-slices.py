class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        streak = 0
        res = 0
        i = 2
        while i<len(nums):
            if (nums[i] - nums [i-1]) == (nums[i-1] - nums[i-2]):
                streak += 1
                res += streak
            else:
                streak = 0
            i += 1
        return res