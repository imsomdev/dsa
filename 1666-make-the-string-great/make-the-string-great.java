class Solution {
    public String makeGood(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (Math.abs(s.charAt(i) - s.charAt(i - 1)) == 32) {
                s = s.substring(0, i - 1) + s.substring(i + 1);
                i = 0;
            }
        }
        return s;
    }
}