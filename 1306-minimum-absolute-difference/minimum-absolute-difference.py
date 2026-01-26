class Solution(object):
    def minimumAbsDifference(self, arr):
        """
        :type arr: List[int]
        :rtype: List[List[int]]
        """
        arr.sort()
        
        n = len(arr)
        res = []
        min_diff = float("inf")
        
        for i in range (1, n):
            temp_diff = abs(arr[i] - arr[i-1])
            if temp_diff < min_diff:
                min_diff = temp_diff

        for i in range (1, n):
            if abs(arr[i] - arr[i-1]) == min_diff:
                res.append([arr[i-1], arr[i]])

        return res