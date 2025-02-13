class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for (int num : nums) {

            minHeap.add((long)num);
        }
        int operations = 0;

        while (minHeap.size() > 1 && minHeap.peek() < k) {
            long firstMin = minHeap.poll();
            long secondMin = minHeap.poll();

            long newVal = Math.min(firstMin, secondMin) * 2 + Math.max(firstMin, secondMin);
            minHeap.add(newVal);

            operations++;
        }

        return operations;
    }
}
