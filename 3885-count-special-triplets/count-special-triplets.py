class Solution(object):
    def specialTriplets(self, nums):
        MOD = 10**9 + 7
        right = Counter(nums)
        left = Counter()
        res = 0
        for x in nums:
            right[x] -= 1
            count_left = left[2 * x]
            count_right = right[2 * x]
            res = (res + count_left * count_right) % MOD
            left[x] += 1
        return res