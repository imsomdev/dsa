class Solution(object):
    def repeatedNTimes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = Counter(nums)
        target = len(nums) // 2
        res = -1
        for num in count:
            if count[num] == target:
                res =  num
        return res