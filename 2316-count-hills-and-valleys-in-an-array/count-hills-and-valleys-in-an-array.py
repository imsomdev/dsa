class Solution(object):
    def countHillValley(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res = 0
        nums = [key for key, group in groupby(nums)]
        print(nums)
        for i in range(1,len(nums)-1):
            if ((nums[i-1]>nums[i]) and (nums[i]<nums[i+1])) or ((nums[i-1]<nums[i]) and(nums[i]>nums[i+1])):
                res += 1
        return res
