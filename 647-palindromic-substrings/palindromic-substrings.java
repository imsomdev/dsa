class Solution {
    private boolean isPalindrome(String s){
        if(s.length() == 1){
            return true;
        }
        char[] charArray = s.toCharArray();
        int lo = 0;
        int hi = s.length() - 1;
        while(lo <= hi){
            if(charArray[lo] != charArray[hi]){
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }
    
    public int countSubstrings(String s) {
        int count = 0;
        char[] charArray = s.toCharArray();
        for(int start = 0; start < s.length(); start++) {
            for(int end = start; end < s.length(); end++) {
                if(isPalindrome(s.substring(start, end + 1))) {
                    count++;
                }
            }
        }
        return count;
    }
}
