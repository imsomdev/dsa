class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        l = 1
        r = max(piles)
        while l <= r:
            mid = l + (r - l) // 2
            total_h = 0
            for b in piles:
                total_h += (b + mid - 1) // mid
                if total_h > h:
                    break
            
            if total_h <= h:
                r = mid - 1
            else:
                l = mid + 1
        
        return l