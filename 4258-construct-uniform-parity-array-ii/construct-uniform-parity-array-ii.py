class Solution:
    def uniformArray(self, nums1: list[int]) -> bool:
        min_n = min(nums1)
        ec = 0
        oc = 0
        for i in nums1:
            if i % 2 == 0:
                ec += 1
            else:
                oc += 1
                
        if min_n % 2 == 0 and oc >= 1:
            return False
        return True