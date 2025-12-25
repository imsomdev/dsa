class Solution(object):
    def maximumHappinessSum(self, happiness, k):
        """
        :type happiness: List[int]
        :type k: int
        :rtype: int
        """
        max_heap = [-h for h in happiness]
        heapq.heapify(max_heap)
        
        res = 0
        for t in range(k):
            current_happiness = -heapq.heappop(max_heap)
            actual_gain = current_happiness - t
            if actual_gain > 0:
                res += actual_gain
            else:
                break
                
        return res