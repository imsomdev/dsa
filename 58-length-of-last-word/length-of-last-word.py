class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        ogString = s.strip()
        res = int(0)
        for i in ogString[::-1]:
            if i == ' ':
               break
            res += 1
        return res