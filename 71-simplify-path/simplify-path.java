import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String[] splitPath = path.trim().split("/");
        for(String s: splitPath) {
            if(s.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else if (!s.isEmpty() && !s.equals(".")) {
                st.push(s);
            }
        }
        for (String s : st) {
            sb.append("/");
            sb.append(s);
        }
        if (sb.length() == 0) {
            sb.append("/");
        }
        return sb.toString();
    }
}
