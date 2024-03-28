class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int start = 0, end, res = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        int violationCount = 0;

        for (end = 0; end < nums.length; end++) {
            int num = nums[end];
            mp.put(num, mp.getOrDefault(num, 0) + 1);

            if (mp.get(num) == k + 1)
                violationCount++;

            while (violationCount > 0) {
                int startNum = nums[start];
                mp.put(startNum, mp.get(startNum) - 1);
                if (mp.get(startNum) == k)
                    violationCount--;
                start++;
            }

            res = Math.max(res, end - start + 1);
        }

        return res;
    }
}
