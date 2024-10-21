class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int res = -1;
        for(int i: nums){
            if (!st.contains(i)) {
                st.add(i);
            }
            else{
                res = i;
            }
        }
        return res;
    }
}