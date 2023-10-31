class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0, nest = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(ch);
                count++;
                nest = Math.max(nest,count);
            }
            else if(ch==')'){
                st.pop();
                count--;
            }
        } 
        return nest;
    }
}