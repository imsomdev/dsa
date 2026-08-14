class Solution:
    def trap(self, height: List[int]) -> int:
        n = len(height)

        lmax = [0] * n
        lmax[0] = height[0]

        for i in range(1, n):
            lmax[i] = max(lmax[i - 1], height[i])

        rmax = [0] * n
        rmax[n - 1] = height[n - 1]

        for i in range(n - 2, -1, -1):
            rmax[i] = max(rmax[i + 1], height[i])

        res = 0

        for i in range(n):
            res += min(lmax[i], rmax[i]) - height[i]

        return res