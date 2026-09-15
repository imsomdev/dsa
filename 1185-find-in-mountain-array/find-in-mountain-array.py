# """
# This is MountainArray's API interface.
# You should not implement it, or speculate about its implementation
# """
#class MountainArray:
#    def get(self, index: int) -> int:
#    def length(self) -> int:

class Solution:
    def findInMountainArray(self, target: int, mountainArr: 'MountainArray') -> int:
        l = 1
        r = mountainArr.length() - 1

        peak = [-1, float("-inf")]

        while l <= r:
            mid = l + (r  - l) // 2
            if mountainArr.get(mid) > peak[1]:
                peak[0] = mid
                peak[1] = mountainArr.get(mid)
            
            if mountainArr.get(mid) > mountainArr.get(mid - 1):
                l = mid + 1
            else:
                r = mid - 1

        l = 0
        r = peak[0]

        while l <= r:
            mid = l + (r - l) // 2
            if mountainArr.get(mid) == target:
                return mid
            elif mountainArr.get(mid) < target:
                l = mid + 1
            else:
                r = mid - 1

        l = peak[0] + 1
        r = mountainArr.length() - 1

        while l <= r:
            mid = l + (r - l) // 2
            if mountainArr.get(mid) == target:
                return mid
            elif mountainArr.get(mid) < target:
                r = mid - 1
            else:
                l = mid + 1

        return -1