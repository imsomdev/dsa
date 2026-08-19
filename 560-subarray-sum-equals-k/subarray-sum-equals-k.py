class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        res = 0
        freq = {0:1}
        ps = 0

        for i in range(len(nums)):
            ps += nums[i]
            sub = ps - k
            if sub in freq:
                res += freq[sub]
            freq[ps] = freq.get(ps, 0) + 1

        return res
