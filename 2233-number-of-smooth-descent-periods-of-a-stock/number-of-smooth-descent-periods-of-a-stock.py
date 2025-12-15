class Solution(object):
    def getDescentPeriods(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        res = len(prices)
        i = 0
        j = i+1
        temp = 0
        window = 0
        while(j < len(prices)):
            if prices[temp] - prices[j] == 1:
                window += 1
                temp += 1
                j += 1
            else:
                res += window * (window+1) // 2
                print(res)
                window = 0
                i = j
                temp = j
                j = i + 1
        res += window * (window+1) // 2
        return res