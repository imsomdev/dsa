class Solution:
    def mySqrt(self, x: int) -> int:
        l = 1
        r = max(1, x // 2)

        while l <= r:
            mid = l + (r - l) // 2
            print(mid)
            if mid * mid == x:
                return mid

            elif mid * mid < x:
                l = mid + 1

            else:
                r = mid - 1

        return l - 1