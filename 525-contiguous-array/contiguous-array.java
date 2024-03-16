class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                sum += 1;
            } else {
                sum -= 1;
            }
            if (sum == 0) {
                res = i + 1;
            } else if (map.containsKey(sum)) {
                res = Math.max(res, i - map.get(sum) + 1);
            } else {
                map.put(sum, i+1);
            }
        }
        return res;
    }
}
