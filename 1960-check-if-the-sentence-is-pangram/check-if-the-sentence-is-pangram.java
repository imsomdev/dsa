class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> st = new HashSet<>();
        for(int i=0; i<sentence.length(); i++){
            st.add(sentence.charAt(i));
        }
        for (char ch = 'a'; ch <= 'z'; ch++){
            if(!st.contains(ch)){
                return false;
            }
        }
        return true;


    }
}