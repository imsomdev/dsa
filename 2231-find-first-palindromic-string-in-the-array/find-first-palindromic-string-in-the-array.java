class Solution {
    private Boolean isPalindrome(String s){
        int start = 0;
        int end = s.length() - 1;
        while(start <=end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        String res = "";
        for(String word: words){
            if(isPalindrome(word)){
                res = word;
                break;
            }
        }
        return res;
    }
}