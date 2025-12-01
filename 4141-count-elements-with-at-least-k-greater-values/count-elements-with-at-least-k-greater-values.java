class Solution {
    public int countElements(int[] nums, int k) {
        int n = nums.length;

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int res = 0;

        for (int num : nums) {
            int idx = upperBound(sorted, num);

            int greater = n - idx;

            if (greater >= k) res++;
        }

        return res;
    }
    
    private int upperBound(int[] arr, int target) {
        int l = 0, r = arr.length;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
