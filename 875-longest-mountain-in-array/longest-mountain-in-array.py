class Solution(object):
    def longestMountain(self, nums):
        n = len(nums)
        if n < 3:
            return 0

        left_len = [1] * n
        right_len = [1] * n

        # left-increasing
        for i in range(1, n):
            if nums[i] > nums[i-1]:
                left_len[i] = left_len[i-1] + 1

        # right-decreasing
        for i in range(n-2, -1, -1):
            if nums[i] > nums[i+1]:
                right_len[i] = right_len[i+1] + 1

        ans = 0
        for i in range(1, n-1):
            if left_len[i] > 1 and right_len[i] > 1:
                ans = max(ans, left_len[i] + right_len[i] - 1)
        print(left_len)
        print(right_len)
        return ans
