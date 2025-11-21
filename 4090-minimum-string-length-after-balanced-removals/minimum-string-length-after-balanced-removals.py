class Solution(object):
    def minLengthAfterRemovals(self, s):
        """
        :type s: str
        :rtype: int
        """
        a = 0
        b = 0
        for c in s:
            if c == "a":
                a = a+1
            if c == "b":
                b = b+1
        return abs(a - b)
        