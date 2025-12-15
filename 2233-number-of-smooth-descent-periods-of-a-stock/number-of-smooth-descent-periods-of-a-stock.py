class Solution(object):
    def getDescentPeriods(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        res = 1
        streak = 1
        i = 0
        while(i < len(prices) - 1):
            if prices[i] - prices[i+1] == 1:
                streak += 1
            else:
                streak = 1
            res += streak
            print(res)
            i += 1
        return res