class Solution {

    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int result = 1;
        for (int i = 0; i < n - 1; i++) {
            int tempResIn = 1;

            for (int j = i; j < n - 1; j++) {
                if (nums[j + 1] > nums[j]) {
                    tempResIn++;
                } else break;
            }
            int tempResDe = 1;

            for (int j = i; j < n - 1; j++) {
                if (nums[j + 1] < nums[j]) {
                    tempResDe++;
                } else break;
            }
            result = Math.max(result, Math.max(tempResIn, tempResDe));
        }
        return result;
    }
}
