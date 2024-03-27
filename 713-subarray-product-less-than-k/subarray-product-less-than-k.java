class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int left = 0, right = 0, res = 0;
        long prod = 1;
        for (right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while (left <= right && prod >= k) {
                prod /= nums[left];
                left++;
            }
            res += right - left + 1;
        }
        return res;
    }
}
