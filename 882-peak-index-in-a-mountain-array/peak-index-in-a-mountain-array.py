class Solution:
    def peakIndexInMountainArray(self, arr: List[int]) -> int:
        l = 1
        r = len(arr) - 1
        res = [-1, float("-inf")]

        while l <= r:
            mid = l + (r  - l) // 2
            if arr[mid] > res[1]:
                res[0] = mid
                res[1] = arr[mid]
            
            if arr[mid] > arr[mid - 1]:
                l = mid + 1
            else:
                r = mid - 1
        
        return res[0]
