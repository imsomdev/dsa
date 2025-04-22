class Solution {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<int[]> res = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(intervals[i][1], end);
            } else {
                res.add(new int[] { start, end });
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        res.add(new int[] { start, end });
        return res.toArray(new int[res.size()][]);
    }
}
