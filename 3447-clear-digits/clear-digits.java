
class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                if (!st.isEmpty()) {
                    st.pop(); 
                }
            } else {
                st.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char ch : st) {
            result.append(ch);
        }

        return result.toString();
    }
}