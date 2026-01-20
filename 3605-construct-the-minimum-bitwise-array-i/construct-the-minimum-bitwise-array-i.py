class Solution(object):
    def minBitwiseArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        ans = []

        for p in nums:
            if p == 2:
                ans.append(-1)
                continue
            temp = p
            trailing_ones = 0
            while temp & 1:
                trailing_ones += 1
                temp >>= 1
            ans.append(p - (1 << (trailing_ones - 1)))

        return ans