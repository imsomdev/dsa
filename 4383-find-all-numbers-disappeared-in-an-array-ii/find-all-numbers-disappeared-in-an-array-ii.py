class Solution:
    def findDisappearedNumbers(
        self, nums: list[int], lower: int, upper: int
    ) -> list[list[int]]:

        nums.sort()
        res = []
        prev = lower - 1

        for num in nums:
            if num < lower:
                continue

            if num > upper:
                break

            if num > prev + 1:
                res.append([prev + 1, num - 1])

            prev = max(prev, num)

        if prev < upper:
            res.append([prev + 1, upper])

        return res