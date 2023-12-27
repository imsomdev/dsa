public class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        if (n <= 1) {
            return 0; // If there are 0 or 1 balloons, no removal needed
        }

        int tt = 0;
        for (int i = 1; i < n; i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                // If current color is same as previous color, remove the balloon with minimum time
                tt += Math.min(neededTime[i], neededTime[i - 1]);
                // Update the neededTime of the current balloon to avoid double counting
                neededTime[i] = Math.max(neededTime[i], neededTime[i - 1]);
            }
        }

        return tt;
    }
}