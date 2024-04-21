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

        for (int[] i : intervals) {
            System.out.print(i[1]);
        }
        int res = 0;
        int end = intervals[0][1];
        int i = 1;
        while (i < intervals.length) {
            int start = intervals[i][0];
            if (end > start) {
                res++;
                end = Math.min(end, intervals[i][1]);
            } else {
                end = intervals[i][1];
            }
            i++;
        }
        return res;
    }
}
