class Solution(object):
    def maximumHappinessSum(self, happiness, k):
        """
        :type happiness: List[int]
        :type k: int
        :rtype: int
        """
        happiness.sort()
        t = 0
        i = len(happiness) - 1
        res = 0
        while(t < k):
            temp = happiness[i] - t
            if temp > 0:
                res += temp
            t += 1
            i -= 1
        return res