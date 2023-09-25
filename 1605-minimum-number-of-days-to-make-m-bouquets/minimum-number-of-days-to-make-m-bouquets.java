class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long val = (long)m * k;
        if(val> n)
            return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }
        int lo = min, hi = max;
        while(lo<=hi){
            int mid = lo + (hi - lo) / 2;
            if(possible(bloomDay, mid, m, k))
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return lo;
    }
    boolean possible(int arr[], int day, int m, int k){
        int n = arr.length; // Size of the array
        int cnt = 0;
        int noOfB = 0;
        // Count the number of bouquets:
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += (cnt / k);
        return noOfB >= m;
    }
}