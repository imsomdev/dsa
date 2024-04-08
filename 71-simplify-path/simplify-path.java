class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
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
        List<String> list = new ArrayList(st);
        return "/"+String.join("/", list);
    }
}
