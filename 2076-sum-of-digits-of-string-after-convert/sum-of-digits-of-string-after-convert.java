public class Solution {
    public int getLucky(String s, int k) {
        StringBuilder transformed = new StringBuilder();
        for (char c : s.toCharArray()) {
            int num = (c - 'a') + 1;
            transformed.append(num);
        }
        int result = 0;
        for (int i = 0; i < k; i++) {
            result = 0;
            for (char digit : transformed.toString().toCharArray()) {
                result += digit - '0';
            }
            transformed = new StringBuilder(Integer.toString(result));
        }
        return result;
    }
}