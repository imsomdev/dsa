class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        def sod(n):
            sum = 0
            while n > 0:
                rem = n % 10
                sum += rem
                n = n // 10
            
            return sum

        for i in range(len(nums)):
            if sod(nums[i]) == i:
                return i
        
        return -1

