class Solution {
    public int characterReplacement(String s, int k) {
        int[] charCount = new int[26];
        int maxCharCount = 0;
        int start = 0;
        int longest = 0;

        for (int end = 0; end < s.length(); end++) {
            charCount[s.charAt(end) - 'A']++;
            maxCharCount = Math.max(maxCharCount, charCount[s.charAt(end) - 'A']);

            

            // Explicitly check if the replacements needed exceed k
            if (end - start + 1 - maxCharCount > k) {
                charCount[s.charAt(start) - 'A']--;
                start++;
            }

            longest = Math.max(longest, end - start + 1);
        }

        return longest;
    }
}

