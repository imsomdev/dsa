class Solution:
    def getLastMoment(self, n: int, left: list[int], right: list[int]) -> int:
        max_left = max(left, default = 0)
        min_right = n - min(right, default = n)

        return max(max_left, min_right)