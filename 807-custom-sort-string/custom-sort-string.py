class Solution(object):
    def customSortString(self, order, s):
        """
        :type order: str
        :type s: str
        :rtype: str
        """
        index = {}
        for idx, char in enumerate(order):
            index[char] = idx
        s = sorted(s, key=lambda x: index.get(x, float('inf')))
        
        return ''.join(s)
