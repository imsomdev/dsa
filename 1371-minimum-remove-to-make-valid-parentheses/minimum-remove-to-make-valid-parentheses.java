class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] a = s.toCharArray();

        int open = 0;//num of open parentheses
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '(') open++;
            else if (a[i] == ')') {//mark the remaining ')' as *
                if (open > 0) open--;
                else a[i] = '*';
            }
        }

        if (open > 0) {//mark the remaining '(' as *
            for (int i = a.length-1; i >= 0; i--) {
                if (open > 0 && a[i] == '(') {
                    a[i] = '*';
                    open--;
                }
            }
        }

        int i = 0;
        for (char c:a) if (c != '*') a[i++] = c;

        return new String(a, 0, i);
    }
}
