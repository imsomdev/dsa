class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int[] arr = new int[nums.length];
        for(int num:nums){
            minHeap.offer(num);
        }
        for(int i=0; i< nums.length; i=i+2){
            int alice = minHeap.poll();
            int bob = minHeap.poll();
            arr[i] = bob;
            arr[i+1] = alice;
        }
        return arr;
    }
}