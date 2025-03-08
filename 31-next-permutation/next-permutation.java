class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakpoint = -1;
        for (int i = n - 2; i >= 0; i--) { 
            if (nums[i] < nums[i + 1]) {
                breakpoint = i;
                break;
            }
        }
        if (breakpoint == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        int smallest = breakpoint + 1;
        for (int i = breakpoint + 1; i < n; i++) { 
            if (nums[i] > nums[breakpoint]) {
                smallest = i;
            }
        }
        swap(nums, breakpoint, smallest);
        reverse(nums, breakpoint + 1, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
