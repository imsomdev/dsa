class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int res = 0;
        int curr = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);
        for(int i:nums){
            curr += i % 2;
            res += mp.getOrDefault(curr - k, 0);
            mp.put(curr, mp.getOrDefault(curr, 0) + 1);
        }
        return res;
    }
}