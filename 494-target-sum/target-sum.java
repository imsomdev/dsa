class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        if (Math.abs(target) > totalSum || (totalSum + target) % 2 != 0) {
            return 0;
        }

        int subsetSum = (totalSum + target) / 2;
        if (subsetSum < 0) return 0;

        int n = nums.length;
        int[][] dp = new int[n + 1][subsetSum + 1];

        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            int num = nums[i - 1];
            for (int s = 0; s <= subsetSum; s++) {
                dp[i][s] = dp[i - 1][s];
                if (s >= num) {
                    dp[i][s] += dp[i - 1][s - num];
                }
            }
        }

        return dp[n][subsetSum];
    }
}