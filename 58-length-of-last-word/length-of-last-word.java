class Solution {
    public int lengthOfLastWord(String s) {
        String trimmedString = s.trim();
        int length = 0;
        for (int i = trimmedString.length() - 1; i >= 0; i--) {
            if (trimmedString.charAt(i) == ' ') {
                if (length > 0) {
                    break;
                }
            } else {
                length++;
            }
        }
        return length;
    }
}