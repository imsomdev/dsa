class Solution(object):
    def solve(self, nums, i, j):
        if i >= j:
            return 0
        if self.dp[i][j] != -1:
            return self.dp[i][j]
        res = float("inf")
        for k in range(i, j):
            temp = self.solve(nums, i, k) + self.solve(nums, k+1, j) + nums[i-1] * nums[k] * nums[j]
            res = min(res, temp)
        self.dp[i][j] = res
        return self.dp[i][j]
    def minScoreTriangulation(self, values):
        """
        :type values: List[int]
        :rtype: int
        """
        n = len(values)
        self.dp = [[-1] * n for _ in range(n)]
        return self.solve(values, 1, n-1)
        