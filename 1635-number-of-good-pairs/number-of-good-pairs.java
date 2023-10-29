class Solution {

    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
            ans += mp.get(num) - 1;
        }

        return ans;
    }
}
