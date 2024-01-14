class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        Set <Character> st = new HashSet<>();
        for(int i=0;i<word1.length(); i++){
            st.add(word1.charAt(i));
            int idx = word1.charAt(i) - 'a';
            count1[idx]++;
        }
        for(int i=0; i< word2.length(); i++){
            if (!st.contains(word2.charAt(i))) {
                return false;
            }
            int idx = word2.charAt(i) - 'a';
            count2[idx]++;

        }
        Arrays.sort(count1);
        Arrays.sort(count2);
        if(Arrays.equals(count1,count2)){
            return true;
        }
        else{
            return false;
        }

    }
}