class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        n = len(nums)
        start = 0
        end = n - 1
        while start <= end:
            if val == nums[start]:
                nums[start] = nums[end]
                end -= 1
            else:
                start += 1
        return start