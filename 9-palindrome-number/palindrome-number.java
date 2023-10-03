class Solution {
    public boolean isPalindrome(int x) {
        // If x is negative, it's not a palindrome
        if (x < 0) return false;

        // Store the original number
        int original = x;
        int reversed = 0;

        while (x != 0) {
            int pop = x % 10;       // pop the last digit
            x /= 10;                // remove the last digit from x

            reversed = reversed * 10 + pop;  // push the last digit to reversed
        }

        return original == reversed;
    }
}