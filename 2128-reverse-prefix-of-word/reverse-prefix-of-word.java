class Solution {
    public String reversePrefix(String word, char ch) {
        char[] res = word.toCharArray();
        int i;
        for(i = 0; i < res.length; i++){
            if(res[i] == ch){
                int j = 0;
                while(j < i){
                    char temp = res[j];
                    res[j] = res[i];
                    res[i] = temp;
                    j++;
                    i--;
                }
                break;
            }
        }
        return new String(res);
    }
}
