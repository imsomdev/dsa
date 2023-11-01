class Solution {

    private boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int maxLength = 0;
        String longestPalindrome = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s, i, j) && (j - i + 1) > maxLength) {
                    maxLength = j - i + 1;
                    longestPalindrome = s.substring(i, j + 1);
                }
            }
        }

        return longestPalindrome;
    }
}
