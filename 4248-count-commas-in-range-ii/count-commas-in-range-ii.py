class Solution:
    def countCommas(self, n: int) -> int:
        ans = 0

        for threshold in [
            1_000,
            1_000_000,
            1_000_000_000,
            1_000_000_000_000,
            1_000_000_000_000_000
        ]:
            if n >= threshold:
                ans += n - threshold + 1

        return ans