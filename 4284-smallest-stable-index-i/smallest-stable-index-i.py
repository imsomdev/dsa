class Solution:
    def firstStableIndex(self, nums: list[int], k: int) -> int:
        pre = [0] * len(nums)
        top = -1
        minv = float("inf")
        res = float("inf")
        for i, num in enumerate(nums):
            if num > top:
                top = num
            pre[i] = top

        for i in range(len(nums) - 1, -1, -1):
            if nums[i] < minv:
                minv = nums[i]

            if pre[i] - minv <= k:
                res = min(res, i)
        
        if res == float("inf"):
            return -1 
        return res