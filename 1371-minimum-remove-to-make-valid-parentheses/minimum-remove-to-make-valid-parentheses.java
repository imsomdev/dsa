class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0; // Maintain balance of parentheses
        
        // Forward pass: Remove excess closing parentheses
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                balance++;
            } else if (ch == ')') {
                if (balance == 0) {
                    continue; // Skip this closing parenthesis
                }
                balance--;
            }
            result.append(ch);
        }
        
        // Backward pass: Remove excess opening parentheses
        StringBuilder finalResult = new StringBuilder();
        for (int i = result.length() - 1; i >= 0; i--) {
            char ch = result.charAt(i);
            if (ch == '(' && balance > 0) {
                balance--;
                continue; // Skip this opening parenthesis
            }
            finalResult.append(ch);
        }
        
        // Reverse the final result to correct order
        return finalResult.reverse().toString();
    }
}
