class Solution {
    private Boolean isPalindrome(String s){
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while(start <=end){
            if(arr[start] != arr[end]){
                return false;
            }
            start ++;
            end --;
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