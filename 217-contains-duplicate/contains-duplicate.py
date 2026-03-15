class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        seen = set()
        for e in nums:
            if e in seen:
                return True
            else:
                seen.add(e)
        return False