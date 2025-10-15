class Solution(object):
    def maxIncreasingSubarrays(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        left_len = []
        left_len.append(1)
        right_len = [1]
        curr_len = 1
        # for left increasing list
        for i in range(1, len(nums)):
            if nums[i] > nums[i-1]:
                curr_len += 1
            else:
                curr_len = 1
            left_len.append(curr_len)
        print(left_len)
        # for right decreasing list
        curr_len = 1
        for i in range(len(nums)-2, -1, -1):
            if nums[i] < nums[i+1]:
                curr_len += 1
            else:
                curr_len = 1
            right_len.append(curr_len)
        print(right_len)
        
        ans = 0
        reversed_right = right_len[::-1]
        for i in range(0, len(nums)-1):
            ans = max(ans,min(left_len[i], reversed_right[i+1]))
        return ans
        
