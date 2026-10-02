class Solution:
    def maxIncreasingSubarrays(self, nums: List[int]) -> int:
        total_max = 0
        curr_size = 1
        prev_size = 0
        total_size = 0
        
        for i in range(1, len(nums)):
            if nums[i] > nums[i-1]:
                curr_size += 1
            
            else:
                total_max = max(total_max, curr_size)
                total_size = max(total_size, min(prev_size, curr_size))
                prev_size = curr_size
                curr_size = 1
        
        total_max = max(total_max, curr_size)
        total_size = max(total_size, min(prev_size, curr_size))

        return max(total_max // 2, total_size)
