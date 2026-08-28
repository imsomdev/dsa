class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        win = deque()
        res = []
        n = len(nums)

        for i in range(n):

            if win and win[0] <= i - k:
                win.popleft()

            while win and nums[win[-1]] < nums[i]:
                win.pop()

            win.append(i)

            if i >= k - 1:
                res.append(nums[win[0]])

        return res