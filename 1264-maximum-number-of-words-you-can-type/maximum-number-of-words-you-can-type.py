class Solution(object):
    def canBeTypedWords(self, text, brokenLetters):
        """
        :type text: str
        :type brokenLetters: str
        :rtype: int
        """
        broken_set = set(brokenLetters)
        words = text.split(' ')
        typeable_count = 0
        for word in words:
            if all(char not in broken_set for char in word):
                typeable_count += 1
        return typeable_count
