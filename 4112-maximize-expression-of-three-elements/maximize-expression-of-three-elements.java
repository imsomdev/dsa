class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MAX_VALUE;;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > a){
                b = a;
                a = nums[i];
            }
            else if(nums[i] > b){
                b = nums[i];
            }
            if(nums[i] <c){
                c = nums[i];
            }
        }
        return (a+b)-c;
    }
}