class Solution(object):
    def repairCars(self, ranks, cars):
        """
        :type ranks: List[int]
        :type cars: int
        :rtype: int
        """
        low = 1
        high = min(ranks) * (cars ** 2)
        ans = high
        
        while low <= high:
            mid = (low + high) // 2
            total_repaired = 0

            for r in ranks:
                total_repaired += int(math.sqrt(mid // r))
                
            if total_repaired >= cars:
                ans = mid
                high = mid - 1
            else:
                low = mid + 1
                
        return ans