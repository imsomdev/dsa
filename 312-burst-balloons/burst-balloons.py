class Solution(object):
    def solve(self, arr, i, j):
        if i > j:
            return 0
        if  self.dp[i][j] != -1:
            return  self.dp[i][j]
        res = 0
        for k in range(i, j + 1):
            temp = (
                self.solve(arr, i, k - 1)
                + self.solve(arr, k + 1, j)
                + arr[i - 1] * arr[k] * arr[j + 1]
            )
            res = max(res, temp)
        self.dp[i][j] = res
        return self.dp[i][j]

    def maxCoins(self, nums):
        nums = [1] + nums + [1]
        n = len(nums)
        self.dp = [[-1] * n for _ in range(n)]
        return self.solve(nums, 1, n - 2)
