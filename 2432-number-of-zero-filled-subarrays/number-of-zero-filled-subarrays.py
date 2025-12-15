class Solution(object):
    def zeroFilledSubarray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        streak = 0
        res = 0
        for num in nums:
            if num == 0:
                streak += 1
            else:
                streak = 0
            res += streak
        return res