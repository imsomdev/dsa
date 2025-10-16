class Solution(object):
    def maxWidthRamp(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        st = [0]
        res = 0
        
        # for building monotonic decreasing stack
        for i in range(1,n):
            if nums[st[-1]] > nums[i]:
                st.append(i)
        
        # for finding the max width
        for j in range((n-1), -1, -1):
            while st and nums[j] >= nums[st[-1]]:
                res = max(res,(j - st[-1]))
                print(res)
                st.pop() 
        return res