class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> st = new HashSet<>();
        int count = 0;
        for(int i=0; i<nums.length; i++){
            st.add(nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            if(st.contains(nums[i]+diff)){
                int j = nums[i]+diff+diff;
                if(st.contains(j)){
                    count+=1;
                }
            }
        }
        return count;
    }
}