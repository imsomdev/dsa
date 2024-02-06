import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int res = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        mp.put(0, 1);
        for (int num : nums) {
            sum += num;
            res += mp.getOrDefault(sum - goal, 0);
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }

        return res;
    }
}
