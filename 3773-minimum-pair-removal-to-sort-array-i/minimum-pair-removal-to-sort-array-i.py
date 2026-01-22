class Solution(object):
    def isSorted(self, arr):
        for i in range(len(arr) - 1):
            if arr[i] > arr[i+1]:
                return False
        return True
        
    def minimumPairRemoval(self, nums):
        count = 0
        curr = list(nums)
        
        while not self.isSorted(curr) and len(curr) > 1:
            min_sum = float('inf')
            best_idx = -1
            
            for i in range(len(curr) - 1):
                pair_sum = curr[i] + curr[i+1]
                if pair_sum < min_sum:
                    min_sum = pair_sum
                    best_idx = i
            curr[best_idx : best_idx + 2] = [min_sum]
            count += 1
            
        return count