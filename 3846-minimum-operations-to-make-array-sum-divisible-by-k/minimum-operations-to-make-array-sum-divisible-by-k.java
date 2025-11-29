class Solution {
    public int minOperations(int[] nums, int k) {
        int sod = 0;
        for(int num : nums){
            sod += num;
        }
        return sod % k;
    }
}