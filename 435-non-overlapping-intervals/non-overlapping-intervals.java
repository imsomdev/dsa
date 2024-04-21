class Solution {

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(
            intervals,
            (a, b) -> {
                if (a[0] == b[0]) {
                    return a[1] - b[1]; // If start times are equal, sort by end times
                } else {
                    return a[0] - b[0]; // Otherwise, sort by start times
                }
            }
        );
        int count = 0;
        int end = Integer.MIN_VALUE;
        
        for (int[] interval : intervals) {
            if (interval[0] < end) { // Overlapping intervals
                count++;
                // Choose the interval with the smaller end time to keep
                end = Math.min(end, interval[1]);
            } else {
                end = interval[1];
            }
        }
        
        return count;
    }
}
