class Solution(object):
    def findSmallestInteger(self, nums, value):
        """
        :type nums: List[int]
        :type value: int
        :rtype: int
        """
        count = [0] * value
        for num in nums:
            rem = num % value
            count[rem] += 1
        res = 0
        while True:
            r = res % value
            if count[r] == 0:
                break
            count[r] -= 1
            res += 1

        return res
