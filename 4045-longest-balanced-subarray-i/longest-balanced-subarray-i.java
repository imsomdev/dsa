class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int res = 0;
        
        for (int i = 0; i < n; i++) {
            Set<Integer> evens = new HashSet<>();
            Set<Integer> odds = new HashSet<>();
            
            for (int j = i; j < n; j++) {
                if (nums[j] % 2 == 0) {
                    evens.add(nums[j]);
                } else {
                    odds.add(nums[j]);
                }
                
                if (evens.size() == odds.size() && evens.size() > 0) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        
        return res;
    }
}