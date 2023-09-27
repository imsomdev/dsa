class Solution {
    public int subarraySum(int[] nums, int k) {
        // Map to store the frequency of prefix sums
        Map<Integer, Integer> prefixSumFrequency = new HashMap<>();
        
        int prefixSum = 0; 
        int count = 0; // To store the count of subarrays with sum = k
        
        // To handle cases where prefixSum is exactly k
        prefixSumFrequency.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            
            // If there are any subarrays ending at i with sum = k,
            // then we add the count of such subarrays to our result.
            if (prefixSumFrequency.containsKey(prefixSum - k)) {
                count += prefixSumFrequency.get(prefixSum - k);
            }
            
            // Update the prefixSumFrequency map
            prefixSumFrequency.put(prefixSum, prefixSumFrequency.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
    }
}