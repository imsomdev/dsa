class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int result = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            int first = -1;
            int last = -1;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == c) {
                    if (first == -1) {
                        first = i;
                    }
                    last = i;
                }
            }
            if (first != -1 && last != -1 && first < last) {
                Set<Character> uniqueChars = new HashSet<>();
                for (int i = first + 1; i < last; i++) {
                    uniqueChars.add(s.charAt(i));
                }
                result += uniqueChars.size();
            }
        }

        return result;
    }
}
