class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        int startSum = 0;
        int endSum = 0;
        int res = 0;
        int start = 0;
        int end = n - 1;
        if(k == n){
            for(int i=0; i < n; i++){
                sum += cardPoints[i];
            }
            return sum;
        }
        for(int i = end; i > end - k; i--){
            endSum += cardPoints[i];
        }
        for(int i = start; i < k; i++){
            startSum += cardPoints[i];
            for(int j = end; j > end - (k - (i+1)); j--){
                sum += cardPoints[j];
            }
            res = Math.max(startSum + sum, res);
            sum = 0;
        }
        return Math.max(endSum, res);
    }
}