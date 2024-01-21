class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> sumOccurrences = new HashMap<>();
        sumOccurrences.put(0, 1);

        for (int num : nums) {
            sum += num;
            count += sumOccurrences.getOrDefault(sum - k, 0);
            sumOccurrences.put(sum, sumOccurrences.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
