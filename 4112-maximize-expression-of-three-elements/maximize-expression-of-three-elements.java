class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int a = -101;
        int b = -101;
        int c = 101;;
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