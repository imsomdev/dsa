class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int n: arr){
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(mp.values());
        while (k > 0)
            k -= pq.poll();
        return k < 0 ? pq.size() + 1 : pq.size();        
    }
}