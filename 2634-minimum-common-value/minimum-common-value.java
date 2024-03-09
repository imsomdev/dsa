class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num: nums1){
            hs.add(num);
        }
        for(int num: nums2){
            if(hs.contains(num)){
                return num;
            }
        }
        return -1;
    }
}