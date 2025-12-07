class Solution {
    int[][] dp;
    public int solve(String text1, String text2, int m, int n){
        if(m == 0 || n == 0){
            return 0;
        }
        if (dp[m][n] != -1){
            return dp[m][n];
        }
        if(text1.charAt(m - 1) == text2.charAt(n - 1)){
            dp[m][n] = 1 + solve(text1, text2, m-1, n-1);
            return dp[m][n];
        }
        else{
            dp[m][n] = Math.max(solve(text1, text2, m-1, n),solve(text1, text2, m, n-1));
            return dp[m][n];
        }

    }
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        
        dp = new int[len1 + 1][len2 + 1];
        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                dp[i][j] = -1;
            }
        }
        int res = solve(text1, text2, len1, len2);
        return res;
    }
}