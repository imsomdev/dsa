class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;
        int windowSum = 0;
        for (int card : cardPoints) {
            totalSum += card;
        }
        for (int i = 0; i < n - k; i++) {
            windowSum += cardPoints[i];
        }
        int minWindowSum = windowSum;
        for (int i = n - k; i < n; i++) {
            windowSum += cardPoints[i] - cardPoints[i - (n - k)];
            minWindowSum = Math.min(minWindowSum, windowSum);
        }
        return totalSum - minWindowSum;
    }
}
