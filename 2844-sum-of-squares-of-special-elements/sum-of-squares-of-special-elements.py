class Solution:
    def sumOfSquares(self, nums: List[int]) -> int:
        res = 0
        n = len(nums)

        for i in range(n):
            idx = i+1
            if n % idx == 0:
                res += nums[idx-1] * nums[idx-1]

        return res