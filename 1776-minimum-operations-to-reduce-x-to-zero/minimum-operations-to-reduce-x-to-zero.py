class Solution:
    def minOperations(self, nums: list[int], x: int) -> int:
        total = sum(nums)
        target = total - x
        n = len(nums)

        if target == 0:
            return n


        l = r = 0
        temp = 0
        win_len = 0
        while r < n and  target >= 0:
            temp += nums[r]
            
            while temp > target:
                temp -= nums[l]
                l += 1

            if temp == target:
                win_len = max(win_len, r - l + 1)
            
            r +=1
        
        if win_len == 0:
            return -1

        return n - win_len