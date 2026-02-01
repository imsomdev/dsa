class Solution(object):
    def minimumCost(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        temp = nums[1:]
        temp.sort()
        return nums[0] + temp[0] + temp[1]