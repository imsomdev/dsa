class Solution:
    def minCost(self, nums: List[int], cost: List[int]) -> int:
        arr = sorted(zip(nums, cost))

        total_cost = sum(cost)
        curr = 0
        target = 0

        for num, c in arr:
            curr += c

            if curr * 2 >= total_cost:
                target = num
                break

        res = 0

        for num, c in arr:
            res += abs(num - target) * c

        return res