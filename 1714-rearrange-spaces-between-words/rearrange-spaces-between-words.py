class Solution(object):
    def reorderSpaces(self, text):
        """
        :type text: str
        :rtype: str
        """
        words = text.split()
        n = len(words)
        space_count = text.count(" ")
        if n == 1:
            return words[0] + " " * space_count

        extra_space = space_count % (n - 1)
        space_between = space_count // (n - 1)
        res = ""
        for i in range(n):
            res += words[i]
            if i < n - 1:
                res += " " * space_between
        
        return res + " " * extra_space