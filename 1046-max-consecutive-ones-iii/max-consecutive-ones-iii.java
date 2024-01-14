class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int max = 0;
        int zeroCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                end++;
            } else {
                zeroCount++;
                while (zeroCount > k) {
                    if (nums[start] == 0) {
                        zeroCount--;
                    }
                    start++;
                }
                end++;
            }

            max = Math.max(max, end - start);
        }

        return max;
    }
}
