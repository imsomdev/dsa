class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> mh = new PriorityQueue<>();
        for(int num:nums){
            mh.add(num);
            if(mh.size() > k){
                mh.poll();
            }
        }
        return mh.peek();
    }
}