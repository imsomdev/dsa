class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stk = new Stack<>();
        ArrayList<Integer> temp = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stk.push(i);
            } else if (ch == ')') {
                if (!stk.isEmpty()) {
                    stk.pop();
                } else {
                    temp.add(i);
                }
            }
        }
        
        while (!stk.isEmpty()) {
            temp.add(stk.pop());
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!temp.contains(i)) {
                result.append(s.charAt(i));
            }
        }
        
        return result.toString();
    }
}
